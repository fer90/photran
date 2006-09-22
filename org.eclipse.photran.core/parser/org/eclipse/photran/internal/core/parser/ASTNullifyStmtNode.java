// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <NullifyStmt> ::= LblDef:<LblDef> tnullify:T_NULLIFY tlparen:T_LPAREN PointerObjectList:<PointerObjectList> trparen:T_RPAREN teos:T_EOS 
 */
public class ASTNullifyStmtNode extends ParseTreeNode
{
    public ASTNullifyStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTLblDefNode getASTLblDef()
    {
        return (ASTLblDefNode)this.getChild("LblDef");
    }

    public Token getASTTnullify()
    {
        return this.getChildToken("tnullify");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTPointerObjectListNode getASTPointerObjectList()
    {
        return (ASTPointerObjectListNode)this.getChild("PointerObjectList");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTeos()
    {
        return this.getChildToken("teos");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTNullifyStmtNode(this); }
}
