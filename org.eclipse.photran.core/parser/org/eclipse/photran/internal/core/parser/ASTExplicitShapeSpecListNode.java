// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ExplicitShapeSpecList> ::= ExplicitShapeSpec:<ExplicitShapeSpec> 
 * <ExplicitShapeSpecList> ::= @:<ExplicitShapeSpecList> tcomma:T_COMMA ExplicitShapeSpec:<ExplicitShapeSpec> 
 */
public class ASTExplicitShapeSpecListNode extends ParseTreeNode
{
    public ASTExplicitShapeSpecListNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public int count()
    {
        ParseTreeNode node = this;
        int count = 1;
        while (node.getChild("@") != null)
        {
            count++;
            node = node.getChild("@");
        }
        return count;
    }

    public ASTExplicitShapeSpecNode getASTExplicitShapeSpec(int index)
    {
        ASTExplicitShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTExplicitShapeSpecListNode)node.getChild("@");
        return (ASTExplicitShapeSpecNode)node.getChild("ExplicitShapeSpec");
    }

    public Token getASTTcomma(int index)
    {
        ASTExplicitShapeSpecListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTExplicitShapeSpecListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTExplicitShapeSpecListNode(this); }
}