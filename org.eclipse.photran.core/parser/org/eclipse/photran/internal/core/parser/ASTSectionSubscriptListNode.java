// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <SectionSubscriptList> ::= SectionSubscript:<SectionSubscript> 
 * <SectionSubscriptList> ::= @:<SectionSubscriptList> tcomma:T_COMMA SectionSubscript:<SectionSubscript> 
 */
public class ASTSectionSubscriptListNode extends ParseTreeNode
{
    public ASTSectionSubscriptListNode(Nonterminal nonterminal, Production production)
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

    public ASTSectionSubscriptNode getASTSectionSubscript(int index)
    {
        ASTSectionSubscriptListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSectionSubscriptListNode)node.getChild("@");
        return (ASTSectionSubscriptNode)node.getChild("SectionSubscript");
    }

    public Token getASTTcomma(int index)
    {
        ASTSectionSubscriptListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSectionSubscriptListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSectionSubscriptListNode(this); }
}