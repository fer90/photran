// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ImplicitStmt> ::= LblDef:<LblDef> timplicit:T_IMPLICIT ImplicitSpecList:<ImplicitSpecList> teos:T_EOS 
 * <ImplicitStmt> ::= LblDef:<LblDef> timplicit:T_IMPLICIT tnone:T_NONE teos:T_EOS 
 */
public class ASTImplicitStmtNode extends ParseTreeNode
{
    public ASTImplicitStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTimplicit()
    {
        return this.getChildToken("timplicit");
    }

    public ASTImplicitSpecListNode getASTImplicitSpecList()
    {
        return (ASTImplicitSpecListNode)this.getChild("ImplicitSpecList");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTnone()
    {
        return this.getChildToken("tnone");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTImplicitStmtNode(this); }
}
