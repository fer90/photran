// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <SubroutineStmt> ::= LblDef:<LblDef> SubroutinePrefix:<SubroutinePrefix> SubroutineName:<SubroutineName> ( tlparen:T_LPAREN SubroutinePars:<SubroutinePars> trparen:T_RPAREN )? teos:T_EOS 
 * <SubroutineStmt> ::= LblDef:<LblDef> SubroutinePrefix:<SubroutinePrefix> SubroutineName:<SubroutineName> error:%error lookahead:T_EOS 
 */
public class ASTSubroutineStmtNode extends ParseTreeNode
{
    public ASTSubroutineStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public ASTSubroutinePrefixNode getASTSubroutinePrefix()
    {
        return (ASTSubroutinePrefixNode)this.getChild("SubroutinePrefix");
    }

    public ASTSubroutineNameNode getASTSubroutineName()
    {
        return (ASTSubroutineNameNode)this.getChild("SubroutineName");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTSubroutineParsNode getASTSubroutinePars()
    {
        return (ASTSubroutineParsNode)this.getChild("SubroutinePars");
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

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSubroutineStmtNode(this); }
}
