// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <NamelistGroupObject> ::= VariableName:<VariableName> 
 */
public class ASTNamelistGroupObjectNode extends ParseTreeNode
{
    public ASTNamelistGroupObjectNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTVariableNameNode getASTVariableName()
    {
        return (ASTVariableNameNode)this.getChild("VariableName");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTNamelistGroupObjectNode(this); }
}