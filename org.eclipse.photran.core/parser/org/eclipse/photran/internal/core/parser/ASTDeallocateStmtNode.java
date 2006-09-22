// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <DeallocateStmt> ::= LblDef:<LblDef> tdeallocate:T_DEALLOCATE tlparen:T_LPAREN AllocateObjectList:<AllocateObjectList> tcomma:T_COMMA tstateq:T_STATEQ Variable:<Variable> trparen:T_RPAREN teos:T_EOS 
 * <DeallocateStmt> ::= LblDef:<LblDef> tdeallocate:T_DEALLOCATE tlparen:T_LPAREN AllocateObjectList:<AllocateObjectList> trparen:T_RPAREN teos:T_EOS 
 */
public class ASTDeallocateStmtNode extends ParseTreeNode
{
    public ASTDeallocateStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTdeallocate()
    {
        return this.getChildToken("tdeallocate");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTAllocateObjectListNode getASTAllocateObjectList()
    {
        return (ASTAllocateObjectListNode)this.getChild("AllocateObjectList");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    public Token getASTTstateq()
    {
        return this.getChildToken("tstateq");
    }

    public ASTVariableNode getASTVariable()
    {
        return (ASTVariableNode)this.getChild("Variable");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTDeallocateStmtNode(this); }
}
