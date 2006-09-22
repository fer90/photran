// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <AttrSpec> ::= tparameter:T_PARAMETER 
 * <AttrSpec> ::= AccessSpec:<AccessSpec> 
 * <AttrSpec> ::= tallocatable:T_ALLOCATABLE 
 * <AttrSpec> ::= tdimension:T_DIMENSION tlparen:T_LPAREN ArraySpec:<ArraySpec> trparen:T_RPAREN 
 * <AttrSpec> ::= texternal:T_EXTERNAL 
 * <AttrSpec> ::= tintent:T_INTENT tlparen:T_LPAREN IntentSpec:<IntentSpec> trparen:T_RPAREN 
 * <AttrSpec> ::= tintrinsic:T_INTRINSIC 
 * <AttrSpec> ::= toptional:T_OPTIONAL 
 * <AttrSpec> ::= tpointer:T_POINTER 
 * <AttrSpec> ::= tsave:T_SAVE 
 * <AttrSpec> ::= ttarget:T_TARGET 
 */
public class ASTAttrSpecNode extends ParseTreeNode
{
    public ASTAttrSpecNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTparameter()
    {
        return this.getChildToken("tparameter");
    }

    public ASTAccessSpecNode getASTAccessSpec()
    {
        return (ASTAccessSpecNode)this.getChild("AccessSpec");
    }

    public Token getASTTallocatable()
    {
        return this.getChildToken("tallocatable");
    }

    public Token getASTTdimension()
    {
        return this.getChildToken("tdimension");
    }

    public Token getASTTlparen()
    {
        return this.getChildToken("tlparen");
    }

    public ASTArraySpecNode getASTArraySpec()
    {
        return (ASTArraySpecNode)this.getChild("ArraySpec");
    }

    public Token getASTTrparen()
    {
        return this.getChildToken("trparen");
    }

    public Token getASTTexternal()
    {
        return this.getChildToken("texternal");
    }

    public Token getASTTintent()
    {
        return this.getChildToken("tintent");
    }

    public ASTIntentSpecNode getASTIntentSpec()
    {
        return (ASTIntentSpecNode)this.getChild("IntentSpec");
    }

    public Token getASTTintrinsic()
    {
        return this.getChildToken("tintrinsic");
    }

    public Token getASTToptional()
    {
        return this.getChildToken("toptional");
    }

    public Token getASTTpointer()
    {
        return this.getChildToken("tpointer");
    }

    public Token getASTTsave()
    {
        return this.getChildToken("tsave");
    }

    public Token getASTTtarget()
    {
        return this.getChildToken("ttarget");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTAttrSpecNode(this); }
}
