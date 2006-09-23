// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <AddOp> ::= tplus:T_PLUS 
 * <AddOp> ::= tminus:T_MINUS 
 */
public class ASTAddOpNode extends ParseTreeNode
{
    public ASTAddOpNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTplus()
    {
        return this.getChildToken("tplus");
    }

    public Token getASTTminus()
    {
        return this.getChildToken("tminus");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAddOpNode(this); }
}