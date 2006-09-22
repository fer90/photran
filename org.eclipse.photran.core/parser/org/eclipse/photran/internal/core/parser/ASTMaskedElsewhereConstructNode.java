// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <MaskedElsewhereConstruct> ::= MaskedElsewhereStmt:<MaskedElsewhereStmt> WhereRange:<WhereRange> 
 */
public class ASTMaskedElsewhereConstructNode extends ParseTreeNode
{
    public ASTMaskedElsewhereConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTMaskedElsewhereStmtNode getASTMaskedElsewhereStmt()
    {
        return (ASTMaskedElsewhereStmtNode)this.getChild("MaskedElsewhereStmt");
    }

    public ASTWhereRangeNode getASTWhereRange()
    {
        return (ASTWhereRangeNode)this.getChild("WhereRange");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTMaskedElsewhereConstructNode(this); }
}
