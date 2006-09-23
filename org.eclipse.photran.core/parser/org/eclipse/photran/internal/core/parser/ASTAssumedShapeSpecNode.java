// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <AssumedShapeSpec> ::= LowerBound:<LowerBound> tcolon:T_COLON 
 * <AssumedShapeSpec> ::= tcolon:T_COLON 
 */
public class ASTAssumedShapeSpecNode extends ParseTreeNode
{
    public ASTAssumedShapeSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLowerBoundNode getASTLowerBound()
    {
        return (ASTLowerBoundNode)this.getChild("LowerBound");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAssumedShapeSpecNode(this); }
}