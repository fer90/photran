// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <AcValueList1> ::= Expr:<Expr> tcomma:T_COMMA Expr2:<Expr> 
 * <AcValueList1> ::= Expr:<Expr> tcomma:T_COMMA AcImpliedDo:<AcImpliedDo> 
 * <AcValueList1> ::= AcImpliedDo:<AcImpliedDo> 
 * <AcValueList1> ::= @:<AcValueList1> tcomma:T_COMMA Expr:<Expr> 
 * <AcValueList1> ::= @:<AcValueList1> tcomma:T_COMMA AcImpliedDo:<AcImpliedDo> 
 */
public class ASTAcValueList1Node extends ParseTreeNode
{
    public ASTAcValueList1Node(Nonterminal nonterminal, Production production)
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
        ASTAcValueList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAcValueList1Node)node.getChild("@");
        return (ASTExprNode)node.getChild("Expr");
    }

    public Token getASTTcomma(int index)
    {
        ASTAcValueList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAcValueList1Node)node.getChild("@");
        return node.getChildToken("tcomma");
    }

    public ASTExprNode getASTExpr2(int index)
    {
        ASTAcValueList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAcValueList1Node)node.getChild("@");
        return (ASTExprNode)node.getChild("Expr2");
    }

    public ASTAcImpliedDoNode getASTAcImpliedDo(int index)
    {
        ASTAcValueList1Node node = this;
        for (int i = 0; i < index; i++)
            node = (ASTAcValueList1Node)node.getChild("@");
        return (ASTAcImpliedDoNode)node.getChild("AcImpliedDo");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAcValueList1Node(this); }
}
