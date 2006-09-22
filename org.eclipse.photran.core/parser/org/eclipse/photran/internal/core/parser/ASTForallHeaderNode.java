// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ForallHeader> ::= tlparen:T_LPAREN ForallTripletSpecList:<ForallTripletSpecList> trparen:T_RPAREN 
 * <ForallHeader> ::= tlparen:T_LPAREN ForallTripletSpecList:<ForallTripletSpecList> tcomma:T_COMMA ScalarMaskExpr:<ScalarMaskExpr> trparen:T_RPAREN 
 */
public class ASTForallHeaderNode extends ParseTreeNode
{
    public ASTForallHeaderNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTForallTripletSpecListNode getASTForallTripletSpecList()
    {
        return (ASTForallTripletSpecListNode)this.getChild("ForallTripletSpecList");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    public ASTScalarMaskExprNode getASTScalarMaskExpr()
    {
        return (ASTScalarMaskExprNode)this.getChild("ScalarMaskExpr");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTForallHeaderNode(this); }
}
