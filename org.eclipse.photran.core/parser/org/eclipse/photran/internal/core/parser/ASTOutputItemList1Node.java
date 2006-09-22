// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <OutputItemList1> ::= Expr:<Expr> tcomma:T_COMMA Expr2:<Expr> 
 * <OutputItemList1> ::= Expr:<Expr> tcomma:T_COMMA OutputImpliedDo:<OutputImpliedDo> 
 * <OutputItemList1> ::= OutputImpliedDo:<OutputImpliedDo> 
 * <OutputItemList1> ::= @:<OutputItemList1> tcomma:T_COMMA Expr:<Expr> 
 * <OutputItemList1> ::= @:<OutputItemList1> tcomma:T_COMMA OutputImpliedDo:<OutputImpliedDo> 
 */
public class ASTOutputItemList1Node extends ParseTreeNode
{
    public ASTOutputItemList1Node(Nonterminal nonterminal, Production production)
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

    public ASTExprNode getASTExpr(int index)
    {
        ASTOutputItemList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTOutputItemList1Node)node.getChild("@");
        return (ASTExprNode)node.getChild("Expr");
    }

    public Token getASTTcomma(int index)
    {
        ASTOutputItemList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTOutputItemList1Node)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    public ASTExprNode getASTExpr2(int index)
    {
        ASTOutputItemList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTOutputItemList1Node)node.getChild("@");
        return (ASTExprNode)node.getChild("Expr2");
    }

    public ASTOutputImpliedDoNode getASTOutputImpliedDo(int index)
    {
        ASTOutputItemList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTOutputItemList1Node)node.getChild("@");
        return (ASTOutputImpliedDoNode)node.getChild("OutputImpliedDo");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTOutputItemList1Node(this); }
}
