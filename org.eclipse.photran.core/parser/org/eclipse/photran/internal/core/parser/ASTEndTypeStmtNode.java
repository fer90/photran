// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <EndTypeStmt> ::= LblDef:<LblDef> tendtype:T_ENDTYPE ( TypeName:<TypeName> )? teos:T_EOS 
 * <EndTypeStmt> ::= LblDef:<LblDef> tend:T_END ttype:T_TYPE ( TypeName:<TypeName> )? teos:T_EOS 
 */
public class ASTEndTypeStmtNode extends ParseTreeNode
{
    public ASTEndTypeStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTendtype()
    {
        return this.getChildToken("tendtype");
    }

    public ASTTypeNameNode getASTTypeName()
    {
        return (ASTTypeNameNode)this.getChild("TypeName");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    public Token getASTTend()
    {
        return this.getChildToken("tend");
    }

    public Token getASTTtype()
    {
        return this.getChildToken("ttype");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTEndTypeStmtNode(this); }
}