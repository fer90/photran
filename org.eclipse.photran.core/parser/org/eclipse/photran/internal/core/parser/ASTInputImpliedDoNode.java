// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <InputImpliedDo> ::= tlparen:T_LPAREN InputItemList:<InputItemList> tcomma:T_COMMA ImpliedDoVariable:<ImpliedDoVariable> tequals:T_EQUALS Expr:<Expr> tcomma2:T_COMMA Expr2:<Expr> trparen:T_RPAREN 
 * <InputImpliedDo> ::= tlparen:T_LPAREN InputItemList:<InputItemList> tcomma:T_COMMA ImpliedDoVariable:<ImpliedDoVariable> tequals:T_EQUALS Expr:<Expr> tcomma2:T_COMMA Expr2:<Expr> tcomma3:T_COMMA Expr3:<Expr> trparen:T_RPAREN 
 */
public class ASTInputImpliedDoNode extends ParseTreeNode
{
    public ASTInputImpliedDoNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTInputItemListNode getASTInputItemList()
    {
        return (ASTInputItemListNode)this.getChild("InputItemList");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    public ASTImpliedDoVariableNode getASTImpliedDoVariable()
    {
        return (ASTImpliedDoVariableNode)this.getChild("ImpliedDoVariable");
    }

    public Token getASTTequals()
    {
        return this.getChildToken("tequals");
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    public Token getASTTcomma2()
    {
        return this.getChildToken("tcomma2");
    }

    public ASTExprNode getASTExpr2()
    {
        return (ASTExprNode)this.getChild("Expr2");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTcomma3()
    {
        return this.getChildToken("tcomma3");
    }

    public ASTExprNode getASTExpr3()
    {
        return (ASTExprNode)this.getChild("Expr3");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTInputImpliedDoNode(this); }
}
