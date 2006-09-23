// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ExternalStmt> ::= LblDef:<LblDef> texternal:T_EXTERNAL ExternalNameList:<ExternalNameList> teos:T_EOS 
 * <ExternalStmt> ::= LblDef:<LblDef> texternal:T_EXTERNAL tcolon:T_COLON tcolon2:T_COLON ExternalNameList:<ExternalNameList> teos:T_EOS 
 */
public class ASTExternalStmtNode extends ParseTreeNode
{
    public ASTExternalStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTexternal()
    {
        return this.getChildToken("texternal");
    }

    public ASTExternalNameListNode getASTExternalNameList()
    {
        return (ASTExternalNameListNode)this.getChild("ExternalNameList");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    public Token getASTTcolon2()
    {
        return this.getChildToken("tcolon2");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTExternalStmtNode(this); }
}