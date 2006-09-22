// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <CommonStmt> ::= LblDef:<LblDef> tcommon:T_COMMON Comlist:<Comlist> teos:T_EOS 
 */
public class ASTCommonStmtNode extends ParseTreeNode
{
    public ASTCommonStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTcommon()
    {
        return this.getChildToken("tcommon");
    }

    public ASTComlistNode getASTComlist()
    {
        return (ASTComlistNode)this.getChild("Comlist");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTCommonStmtNode(this); }
}
