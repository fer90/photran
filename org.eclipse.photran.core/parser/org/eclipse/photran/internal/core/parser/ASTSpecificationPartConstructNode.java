// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <SpecificationPartConstruct> ::= UseStmt:<UseStmt> 
 * <SpecificationPartConstruct> ::= ImplicitStmt:<ImplicitStmt> 
 * <SpecificationPartConstruct> ::= ParameterStmt:<ParameterStmt> 
 * <SpecificationPartConstruct> ::= FormatStmt:<FormatStmt> 
 * <SpecificationPartConstruct> ::= EntryStmt:<EntryStmt> 
 * <SpecificationPartConstruct> ::= DeclarationConstruct:<DeclarationConstruct> 
 */
public class ASTSpecificationPartConstructNode extends ParseTreeNode
{
    public ASTSpecificationPartConstructNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTUseStmtNode getASTUseStmt()
    {
        return (ASTUseStmtNode)this.getChild("UseStmt");
    }

    public ASTImplicitStmtNode getASTImplicitStmt()
    {
        return (ASTImplicitStmtNode)this.getChild("ImplicitStmt");
    }

    public ASTParameterStmtNode getASTParameterStmt()
    {
        return (ASTParameterStmtNode)this.getChild("ParameterStmt");
    }

    public ASTFormatStmtNode getASTFormatStmt()
    {
        return (ASTFormatStmtNode)this.getChild("FormatStmt");
    }

    public ASTEntryStmtNode getASTEntryStmt()
    {
        return (ASTEntryStmtNode)this.getChild("EntryStmt");
    }

    public ASTDeclarationConstructNode getASTDeclarationConstruct()
    {
        return (ASTDeclarationConstructNode)this.getChild("DeclarationConstruct");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSpecificationPartConstructNode(this); }
}