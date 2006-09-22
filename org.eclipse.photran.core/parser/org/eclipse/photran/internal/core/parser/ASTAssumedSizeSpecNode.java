// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <AssumedSizeSpec> ::= tasterisk:T_ASTERISK 
 * <AssumedSizeSpec> ::= LowerBound:<LowerBound> tcolon:T_COLON tasterisk:T_ASTERISK 
 * <AssumedSizeSpec> ::= ExplicitShapeSpecList:<ExplicitShapeSpecList> tcomma:T_COMMA tasterisk:T_ASTERISK 
 * <AssumedSizeSpec> ::= ExplicitShapeSpecList:<ExplicitShapeSpecList> tcomma:T_COMMA LowerBound:<LowerBound> tcolon:T_COLON tasterisk:T_ASTERISK 
 */
public class ASTAssumedSizeSpecNode extends ParseTreeNode
{
    public ASTAssumedSizeSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTasterisk()
    {
        return this.getChildToken("tasterisk");
    }

    public ASTLowerBoundNode getASTLowerBound()
    {
        return (ASTLowerBoundNode)this.getChild("LowerBound");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    public ASTExplicitShapeSpecListNode getASTExplicitShapeSpecList()
    {
        return (ASTExplicitShapeSpecListNode)this.getChild("ExplicitShapeSpecList");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAssumedSizeSpecNode(this); }
}
