// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <UFFactor> ::= UFPrimary:<UFPrimary> ( PowerOp:<PowerOp> UFFactor:<UFFactor> )? 
 */
public class ASTUFFactorNode extends ParseTreeNode
{
    public ASTUFFactorNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTUFPrimaryNode getASTUFPrimary()
    {
        return (ASTUFPrimaryNode)this.getChild("UFPrimary");
    }

    public ASTPowerOpNode getASTPowerOp()
    {
        return (ASTPowerOpNode)this.getChild("PowerOp");
    }

    public ASTUFFactorNode getASTUFFactor()
    {
        return (ASTUFFactorNode)this.getChild("UFFactor");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTUFFactorNode(this); }
}
