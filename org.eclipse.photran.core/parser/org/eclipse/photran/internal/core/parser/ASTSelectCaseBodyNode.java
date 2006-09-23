// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <SelectCaseBody> ::= CaseStmt:<CaseStmt> 
 * <SelectCaseBody> ::= SelectCaseBody:<SelectCaseBody> CaseBodyConstruct:<CaseBodyConstruct> 
 */
public class ASTSelectCaseBodyNode extends ParseTreeNode
{
    public ASTSelectCaseBodyNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTCaseStmtNode getASTCaseStmt()
    {
        return (ASTCaseStmtNode)this.getChild("CaseStmt");
    }

    public ASTSelectCaseBodyNode getASTSelectCaseBody()
    {
        return (ASTSelectCaseBodyNode)this.getChild("SelectCaseBody");
    }

    public ASTCaseBodyConstructNode getASTCaseBodyConstruct()
    {
        return (ASTCaseBodyConstructNode)this.getChild("CaseBodyConstruct");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSelectCaseBodyNode(this); }
}