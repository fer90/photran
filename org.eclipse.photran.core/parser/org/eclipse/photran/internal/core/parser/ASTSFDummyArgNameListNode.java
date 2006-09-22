// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <SFDummyArgNameList> ::= SFDummyArgName:<SFDummyArgName> 
 * <SFDummyArgNameList> ::= @:<SFDummyArgNameList> tcomma:T_COMMA SFDummyArgName:<SFDummyArgName> 
 */
public class ASTSFDummyArgNameListNode extends ParseTreeNode
{
    public ASTSFDummyArgNameListNode(Nonterminal nonterminal, Production production)
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

    public ASTSFDummyArgNameNode getASTSFDummyArgName(int index)
    {
        ASTSFDummyArgNameListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSFDummyArgNameListNode)node.getChild("@");
        return (ASTSFDummyArgNameNode)node.getChild("SFDummyArgName");
    }

    public Token getASTTcomma(int index)
    {
        ASTSFDummyArgNameListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTSFDummyArgNameListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSFDummyArgNameListNode(this); }
}
