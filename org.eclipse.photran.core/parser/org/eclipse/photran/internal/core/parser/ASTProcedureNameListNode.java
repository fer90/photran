// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ProcedureNameList> ::= ProcedureName:<ProcedureName> 
 * <ProcedureNameList> ::= @:<ProcedureNameList> tcomma:T_COMMA ProcedureName:<ProcedureName> 
 */
public class ASTProcedureNameListNode extends ParseTreeNode
{
    public ASTProcedureNameListNode(Nonterminal nonterminal, Production production)
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

    public ASTProcedureNameNode getASTProcedureName(int index)
    {
        ASTProcedureNameListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTProcedureNameListNode)node.getChild("@");
        return (ASTProcedureNameNode)node.getChild("ProcedureName");
    }

    public Token getASTTcomma(int index)
    {
        ASTProcedureNameListNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTProcedureNameListNode)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTProcedureNameListNode(this); }
}