// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <WhereBodyConstructBlock> ::= WhereBodyConstruct:<WhereBodyConstruct> 
 * <WhereBodyConstructBlock> ::= WhereBodyConstructBlock:<WhereBodyConstructBlock> WhereBodyConstruct:<WhereBodyConstruct> 
 */
public class ASTWhereBodyConstructBlockNode extends ParseTreeNode
{
    public ASTWhereBodyConstructBlockNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTWhereBodyConstructNode getASTWhereBodyConstruct()
    {
        return (ASTWhereBodyConstructNode)this.getChild("WhereBodyConstruct");
    }

    public ASTWhereBodyConstructBlockNode getASTWhereBodyConstructBlock()
    {
        return (ASTWhereBodyConstructBlockNode)this.getChild("WhereBodyConstructBlock");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTWhereBodyConstructBlockNode(this); }
}