// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <WhereStmt> ::= LblDef:<LblDef> twhere:T_WHERE tlparen:T_LPAREN MaskExpr:<MaskExpr> trparen:T_RPAREN AssignmentStmt:<AssignmentStmt> 
 */
public class ASTWhereStmtNode extends ParseTreeNode
{
    public ASTWhereStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTwhere()
    {
        return this.getChildToken("twhere");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTMaskExprNode getASTMaskExpr()
    {
        return (ASTMaskExprNode)this.getChild("MaskExpr");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public ASTAssignmentStmtNode getASTAssignmentStmt()
    {
        return (ASTAssignmentStmtNode)this.getChild("AssignmentStmt");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTWhereStmtNode(this); }
}