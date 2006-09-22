// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <SaveStmt> ::= LblDef:<LblDef> tsave:T_SAVE teos:T_EOS 
 * <SaveStmt> ::= LblDef:<LblDef> tsave:T_SAVE ( tcolon:T_COLON tcolon2:T_COLON )? SavedEntityList:<SavedEntityList> teos:T_EOS 
 */
public class ASTSaveStmtNode extends ParseTreeNode
{
    public ASTSaveStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTsave()
    {
        return this.getChildToken("tsave");
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

    public ASTSavedEntityListNode getASTSavedEntityList()
    {
        return (ASTSavedEntityListNode)this.getChild("SavedEntityList");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSaveStmtNode(this); }
}
