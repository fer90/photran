// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <SubroutineInterfaceRange> ::= SubprogramInterfaceBody:<SubprogramInterfaceBody> EndSubroutineStmt:<EndSubroutineStmt> 
 * <SubroutineInterfaceRange> ::= EndSubroutineStmt:<EndSubroutineStmt> 
 */
public class ASTSubroutineInterfaceRangeNode extends ParseTreeNode
{
    public ASTSubroutineInterfaceRangeNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTSubprogramInterfaceBodyNode getASTSubprogramInterfaceBody()
    {
        return (ASTSubprogramInterfaceBodyNode)this.getChild("SubprogramInterfaceBody");
    }

    public ASTEndSubroutineStmtNode getASTEndSubroutineStmt()
    {
        return (ASTEndSubroutineStmtNode)this.getChild("EndSubroutineStmt");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSubroutineInterfaceRangeNode(this); }
}
