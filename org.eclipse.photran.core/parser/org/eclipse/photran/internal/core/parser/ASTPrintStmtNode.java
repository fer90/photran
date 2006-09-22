// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <PrintStmt> ::= LblDef:<LblDef> tprint:T_PRINT FormatIdentifier:<FormatIdentifier> tcomma:T_COMMA OutputItemList:<OutputItemList> teos:T_EOS 
 * <PrintStmt> ::= LblDef:<LblDef> tprint:T_PRINT FormatIdentifier:<FormatIdentifier> teos:T_EOS 
 */
public class ASTPrintStmtNode extends ParseTreeNode
{
    public ASTPrintStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTprint()
    {
        return this.getChildToken("tprint");
    }

    public ASTFormatIdentifierNode getASTFormatIdentifier()
    {
        return (ASTFormatIdentifierNode)this.getChild("FormatIdentifier");
    }

    public Token getASTTcomma()
    {
        return this.getChildToken("tcomma");
    }

    public ASTOutputItemListNode getASTOutputItemList()
    {
        return (ASTOutputItemListNode)this.getChild("OutputItemList");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTPrintStmtNode(this); }
}
