// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <ScalarVariable> ::= VariableName:<VariableName> 
 * <ScalarVariable> ::= ArrayElement:<ArrayElement> 
 */
public class ASTScalarVariableNode extends ParseTreeNode
{
    public ASTScalarVariableNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTVariableNameNode getASTVariableName()
    {
        return (ASTVariableNameNode)this.getChild("VariableName");
    }

    public ASTArrayElementNode getASTArrayElement()
    {
        return (ASTArrayElementNode)this.getChild("ArrayElement");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTScalarVariableNode(this); }
}
