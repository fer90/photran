// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <Constant> ::= NamedConstantUse:<NamedConstantUse> 
 * <Constant> ::= UnsignedArithmeticConstant:<UnsignedArithmeticConstant> 
 * <Constant> ::= tplus:T_PLUS UnsignedArithmeticConstant:<UnsignedArithmeticConstant> 
 * <Constant> ::= tminus:T_MINUS UnsignedArithmeticConstant:<UnsignedArithmeticConstant> 
 * <Constant> ::= tscon:T_SCON 
 * <Constant> ::= ticon:T_ICON tunderscore:T_UNDERSCORE tscon:T_SCON 
 * <Constant> ::= NamedConstantUse:<NamedConstantUse> tunderscore:T_UNDERSCORE tscon:T_SCON 
 * <Constant> ::= LogicalConstant:<LogicalConstant> 
 * <Constant> ::= StructureConstructor:<StructureConstructor> 
 * <Constant> ::= BozLiteralConstant:<BozLiteralConstant> 
 * <Constant> ::= thcon:T_HCON 
 */
public class ASTConstantNode extends ParseTreeNode
{
    public ASTConstantNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTNamedConstantUseNode getASTNamedConstantUse()
    {
        return (ASTNamedConstantUseNode)this.getChild("NamedConstantUse");
    }

    public ASTUnsignedArithmeticConstantNode getASTUnsignedArithmeticConstant()
    {
        return (ASTUnsignedArithmeticConstantNode)this.getChild("UnsignedArithmeticConstant");
    }

    public Token getASTTplus()
    {
        return this.getChildToken("tplus");
    }

    public Token getASTTminus()
    {
        return this.getChildToken("tminus");
    }

    public Token getASTTscon()
    {
        return this.getChildToken("tscon");
    }

    public Token getASTTicon()
    {
        return this.getChildToken("ticon");
    }

    public Token getASTTunderscore()
    {
        return this.getChildToken("tunderscore");
    }

    public ASTLogicalConstantNode getASTLogicalConstant()
    {
        return (ASTLogicalConstantNode)this.getChild("LogicalConstant");
    }

    public ASTStructureConstructorNode getASTStructureConstructor()
    {
        return (ASTStructureConstructorNode)this.getChild("StructureConstructor");
    }

    public ASTBozLiteralConstantNode getASTBozLiteralConstant()
    {
        return (ASTBozLiteralConstantNode)this.getChild("BozLiteralConstant");
    }

    public Token getASTThcon()
    {
        return this.getChildToken("thcon");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTConstantNode(this); }
}
