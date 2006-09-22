// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <BlockDataBody> ::= BlockDataBodyConstruct:<BlockDataBodyConstruct> 
 * <BlockDataBody> ::= @:<BlockDataBody> BlockDataBodyConstruct:<BlockDataBodyConstruct> 
 */
public class ASTBlockDataBodyNode extends ParseTreeNode
{
    public ASTBlockDataBodyNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public int count()
    {
        ParseTreeNode node = this;
        int count = 1;
        while (node.getChild("@") != null)
        {
            count++;
            node = node.getChild("@");
        }
        return count;
    }

    public ASTBlockDataBodyConstructNode getASTBlockDataBodyConstruct(int index)
    {
        ASTBlockDataBodyNode node = this;
        for (int i = 0; i < index; i++)
            node = (ASTBlockDataBodyNode)node.getChild("@");
        return (ASTBlockDataBodyConstructNode)node.getChild("BlockDataBodyConstruct");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTBlockDataBodyNode(this); }
}
