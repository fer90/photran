// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <CaseValueRangeList> ::= CaseValueRange:<CaseValueRange> 
 * <CaseValueRangeList> ::= @:<CaseValueRangeList> tcomma:T_COMMA CaseValueRange:<CaseValueRange> 
 */
public class ASTCaseValueRangeListNode extends ParseTreeNode
{
    public ASTCaseValueRangeListNode(Nonterminal nonterminal, Production production)
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

    public ASTCaseValueRangeNode getASTCaseValueRange(int index)
    {
        ASTCaseValueRangeListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTCaseValueRangeListNode)node.getChild("@");
        return (ASTCaseValueRangeNode)node.getChild("CaseValueRange");
    }

    public Token getASTTcomma(int index)
    {
        ASTCaseValueRangeListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTCaseValueRangeListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCaseValueRangeListNode(this); }
}