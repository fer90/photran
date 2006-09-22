// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <SFTerm> ::= SFFactor:<SFFactor> 
 * <SFTerm> ::= SFTerm:<SFTerm> MultOp:<MultOp> MultOperand:<MultOperand> 
 */
public class ASTSFTermNode extends ParseTreeNode
{
    public ASTSFTermNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTSFFactorNode getASTSFFactor()
    {
        return (ASTSFFactorNode)this.getChild("SFFactor");
    }

    public ASTSFTermNode getASTSFTerm()
    {
        return (ASTSFTermNode)this.getChild("SFTerm");
    }

    public ASTMultOpNode getASTMultOp()
    {
        return (ASTMultOpNode)this.getChild("MultOp");
    }

    public ASTMultOperandNode getASTMultOperand()
    {
        return (ASTMultOperandNode)this.getChild("MultOperand");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSFTermNode(this); }
}
