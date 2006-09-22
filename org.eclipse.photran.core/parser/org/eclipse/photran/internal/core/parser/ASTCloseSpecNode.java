// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <CloseSpec> ::= tuniteq:T_UNITEQ UnitIdentifier:<UnitIdentifier> 
 * <CloseSpec> ::= terreq:T_ERREQ LblRef:<LblRef> 
 * <CloseSpec> ::= tstatuseq:T_STATUSEQ CExpr:<CExpr> 
 * <CloseSpec> ::= tiostateq:T_IOSTATEQ ScalarVariable:<ScalarVariable> 
 */
public class ASTCloseSpecNode extends ParseTreeNode
{
    public ASTCloseSpecNode(Nonterminal nonterminal, Production production)
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

    public Token getASTTstatuseq()
    {
        return this.getChildToken("tstatuseq");
    }

    public ASTCExprNode getASTCExpr()
    {
        return (ASTCExprNode)this.getChild("CExpr");
    }

    public Token getASTTiostateq()
    {
        return this.getChildToken("tiostateq");
    }

    public ASTScalarVariableNode getASTScalarVariable()
    {
        return (ASTScalarVariableNode)this.getChild("ScalarVariable");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCloseSpecNode(this); }
}
