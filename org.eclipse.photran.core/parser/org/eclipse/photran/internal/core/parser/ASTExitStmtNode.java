// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ExitStmt> ::= LblDef:<LblDef> texit:T_EXIT ( Name:<Name> )? teos:T_EOS 
 */
public class ASTExitStmtNode extends ParseTreeNode
{
    public ASTExitStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTexit()
    {
        return this.getChildToken("texit");
    }

    public ASTNameNode getASTName()
    {
        return (ASTNameNode)this.getChild("Name");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTExitStmtNode(this); }
}
