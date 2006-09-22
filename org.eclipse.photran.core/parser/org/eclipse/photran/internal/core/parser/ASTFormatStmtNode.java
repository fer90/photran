// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <FormatStmt> ::= LblDef:<LblDef> tformat:T_FORMAT tlparen:T_LPAREN ( FmtSpec:<FmtSpec> )? trparen:T_RPAREN teos:T_EOS 
 * <FormatStmt> ::= LblDef:<LblDef> tformat:T_FORMAT error:%error lookahead:T_EOS 
 */
public class ASTFormatStmtNode extends ParseTreeNode
{
    public ASTFormatStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTformat()
    {
        return this.getChildToken("tformat");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTFmtSpecNode getASTFmtSpec()
    {
        return (ASTFmtSpecNode)this.getChild("FmtSpec");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTError()
    {
        return this.getChildToken("error");
    }

    public Token getASTLookahead()
    {
        return this.getChildToken("lookahead");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTFormatStmtNode(this); }
}
