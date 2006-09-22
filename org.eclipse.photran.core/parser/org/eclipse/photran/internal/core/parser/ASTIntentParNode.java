// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <IntentPar> ::= DummyArgName:<DummyArgName> 
 */
public class ASTIntentParNode extends ParseTreeNode
{
    public ASTIntentParNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTDummyArgNameNode getASTDummyArgName()
    {
        return (ASTDummyArgNameNode)this.getChild("DummyArgName");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTIntentParNode(this); }
}
