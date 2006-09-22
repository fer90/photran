// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ConnectSpec> ::= tuniteq:T_UNITEQ UnitIdentifier:<UnitIdentifier> 
 * <ConnectSpec> ::= terreq:T_ERREQ LblRef:<LblRef> 
 * <ConnectSpec> ::= tfileeq:T_FILEEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tstatuseq:T_STATUSEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= taccesseq:T_ACCESSEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tformeq:T_FORMEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= trecleq:T_RECLEQ Expr:<Expr> 
 * <ConnectSpec> ::= tblankeq:T_BLANKEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tiostateq:T_IOSTATEQ ScalarVariable:<ScalarVariable> 
 * <ConnectSpec> ::= tpositioneq:T_POSITIONEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tactioneq:T_ACTIONEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tdelimeq:T_DELIMEQ CExpr:<CExpr> 
 * <ConnectSpec> ::= tpadeq:T_PADEQ CExpr:<CExpr> 
 */
public class ASTConnectSpecNode extends ParseTreeNode
{
    public ASTConnectSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTuniteq()
    {
        return this.getChildToken("tuniteq");
    }

    public ASTUnitIdentifierNode getASTUnitIdentifier()
    {
        return (ASTUnitIdentifierNode)this.getChild("UnitIdentifier");
    }

    public Token getASTTerreq()
    {
        return this.getChildToken("terreq");
    }

    public ASTLblRefNode getASTLblRef()
    {
        return (ASTLblRefNode)this.getChild("LblRef");
    }

    public Token getASTTfileeq()
    {
        return this.getChildToken("tfileeq");
    }

    public ASTCExprNode getASTCExpr()
    {
        return (ASTCExprNode)this.getChild("CExpr");
    }

    public Token getASTTstatuseq()
    {
        return this.getChildToken("tstatuseq");
    }

    public Token getASTTaccesseq()
    {
        return this.getChildToken("taccesseq");
    }

    public Token getASTTformeq()
    {
        return this.getChildToken("tformeq");
    }

    public Token getASTTrecleq()
    {
        return this.getChildToken("trecleq");
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    public Token getASTTblankeq()
    {
        return this.getChildToken("tblankeq");
    }

    public Token getASTTiostateq()
    {
        return this.getChildToken("tiostateq");
    }

    public ASTScalarVariableNode getASTScalarVariable()
    {
        return (ASTScalarVariableNode)this.getChild("ScalarVariable");
    }

    public Token getASTTpositioneq()
    {
        return this.getChildToken("tpositioneq");
    }

    public Token getASTTactioneq()
    {
        return this.getChildToken("tactioneq");
    }

    public Token getASTTdelimeq()
    {
        return this.getChildToken("tdelimeq");
    }

    public Token getASTTpadeq()
    {
        return this.getChildToken("tpadeq");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTConnectSpecNode(this); }
}
