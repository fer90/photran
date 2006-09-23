// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * <SpecificationStmt> ::= AccessStmt:<AccessStmt> 
 * <SpecificationStmt> ::= AllocatableStmt:<AllocatableStmt> 
 * <SpecificationStmt> ::= CommonStmt:<CommonStmt> 
 * <SpecificationStmt> ::= DataStmt:<DataStmt> 
 * <SpecificationStmt> ::= DimensionStmt:<DimensionStmt> 
 * <SpecificationStmt> ::= EquivalenceStmt:<EquivalenceStmt> 
 * <SpecificationStmt> ::= ExternalStmt:<ExternalStmt> 
 * <SpecificationStmt> ::= IntentStmt:<IntentStmt> 
 * <SpecificationStmt> ::= IntrinsicStmt:<IntrinsicStmt> 
 * <SpecificationStmt> ::= NamelistStmt:<NamelistStmt> 
 * <SpecificationStmt> ::= OptionalStmt:<OptionalStmt> 
 * <SpecificationStmt> ::= PointerStmt:<PointerStmt> 
 * <SpecificationStmt> ::= SaveStmt:<SaveStmt> 
 * <SpecificationStmt> ::= TargetStmt:<TargetStmt> 
 */
public class ASTSpecificationStmtNode extends ParseTreeNode
{
    public ASTSpecificationStmtNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTAccessStmtNode getASTAccessStmt()
    {
        return (ASTAccessStmtNode)this.getChild("AccessStmt");
    }

    public ASTAllocatableStmtNode getASTAllocatableStmt()
    {
        return (ASTAllocatableStmtNode)this.getChild("AllocatableStmt");
    }

    public ASTCommonStmtNode getASTCommonStmt()
    {
        return (ASTCommonStmtNode)this.getChild("CommonStmt");
    }

    public ASTDataStmtNode getASTDataStmt()
    {
        return (ASTDataStmtNode)this.getChild("DataStmt");
    }

    public ASTDimensionStmtNode getASTDimensionStmt()
    {
        return (ASTDimensionStmtNode)this.getChild("DimensionStmt");
    }

    public ASTEquivalenceStmtNode getASTEquivalenceStmt()
    {
        return (ASTEquivalenceStmtNode)this.getChild("EquivalenceStmt");
    }

    public ASTExternalStmtNode getASTExternalStmt()
    {
        return (ASTExternalStmtNode)this.getChild("ExternalStmt");
    }

    public ASTIntentStmtNode getASTIntentStmt()
    {
        return (ASTIntentStmtNode)this.getChild("IntentStmt");
    }

    public ASTIntrinsicStmtNode getASTIntrinsicStmt()
    {
        return (ASTIntrinsicStmtNode)this.getChild("IntrinsicStmt");
    }

    public ASTNamelistStmtNode getASTNamelistStmt()
    {
        return (ASTNamelistStmtNode)this.getChild("NamelistStmt");
    }

    public ASTOptionalStmtNode getASTOptionalStmt()
    {
        return (ASTOptionalStmtNode)this.getChild("OptionalStmt");
    }

    public ASTPointerStmtNode getASTPointerStmt()
    {
        return (ASTPointerStmtNode)this.getChild("PointerStmt");
    }

    public ASTSaveStmtNode getASTSaveStmt()
    {
        return (ASTSaveStmtNode)this.getChild("SaveStmt");
    }

    public ASTTargetStmtNode getASTTargetStmt()
    {
        return (ASTTargetStmtNode)this.getChild("TargetStmt");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSpecificationStmtNode(this); }
}