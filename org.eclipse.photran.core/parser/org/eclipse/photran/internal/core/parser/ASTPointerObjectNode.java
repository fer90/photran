// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <PointerObject> ::= Name:<Name> 
 * <PointerObject> ::= PointerField:<PointerField> 
 */
public class ASTPointerObjectNode extends ParseTreeNode
{
    public ASTPointerObjectNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTNameNode getASTName()
    {
        return (ASTNameNode)this.getChild("Name");
    }

    public ASTPointerFieldNode getASTPointerField()
    {
        return (ASTPointerFieldNode)this.getChild("PointerField");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTPointerObjectNode(this); }
}
