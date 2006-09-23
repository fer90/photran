// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <LblRefList> ::= LblRef:<LblRef> 
 * <LblRefList> ::= @:<LblRefList> tcomma:T_COMMA LblRef:<LblRef> 
 */
public class ASTLblRefListNode extends ParseTreeNode
{
    public ASTLblRefListNode(Nonterminal nonterminal, Production production)
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

    public ASTLblRefNode getASTLblRef(int index)
    {
        ASTLblRefListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTLblRefListNode)node.getChild("@");
        return (ASTLblRefNode)node.getChild("LblRef");
    }

    public Token getASTTcomma(int index)
    {
        ASTLblRefListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTLblRefListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTLblRefListNode(this); }
}