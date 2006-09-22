// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <EndModuleStmt> ::= LblDef:<LblDef> tend:T_END teos:T_EOS 
 * <EndModuleStmt> ::= LblDef:<LblDef> tendmodule:T_ENDMODULE ( EndName:<EndName> )? teos:T_EOS 
 * <EndModuleStmt> ::= LblDef:<LblDef> tend:T_END tmodule:T_MODULE ( EndName:<EndName> )? teos:T_EOS 
 */
public class ASTEndModuleStmtNode extends ParseTreeNode
{
    public ASTEndModuleStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTend()
    {
        return this.getChildToken("tend");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTendmodule()
    {
        return this.getChildToken("tendmodule");
    }

    public ASTEndNameNode getASTEndName()
    {
        return (ASTEndNameNode)this.getChild("EndName");
    }

    public Token getASTTmodule()
    {
        return this.getChildToken("tmodule");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTEndModuleStmtNode(this); }
}
