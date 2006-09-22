// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <PointerStmtObject> ::= PointerName:<PointerName> 
 * <PointerStmtObject> ::= PointerName:<PointerName> tlparen:T_LPAREN DeferredShapeSpecList:<DeferredShapeSpecList> trparen:T_RPAREN 
 */
public class ASTPointerStmtObjectNode extends ParseTreeNode
{
    public ASTPointerStmtObjectNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTPointerNameNode getASTPointerName()
    {
        return (ASTPointerNameNode)this.getChild("PointerName");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTDeferredShapeSpecListNode getASTDeferredShapeSpecList()
    {
        return (ASTDeferredShapeSpecListNode)this.getChild("DeferredShapeSpecList");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTPointerStmtObjectNode(this); }
}
