// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <ForallTripletSpecList> ::= Name:<Name> tequals:T_EQUALS Subscript:<Subscript> tcolon:T_COLON Subscript2:<Subscript> 
 * <ForallTripletSpecList> ::= Name:<Name> tequals:T_EQUALS Subscript:<Subscript> tcolon:T_COLON Subscript2:<Subscript> tcolon2:T_COLON Expr:<Expr> 
 */
public class ASTForallTripletSpecListNode extends ParseTreeNode
{
    public ASTForallTripletSpecListNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public ASTNameNode getASTName()
    {
        return (ASTNameNode)this.getChild("Name");
    }

    public Token getASTTequals()
    {
        return this.getChildToken("tequals");
    }

    public ASTSubscriptNode getASTSubscript()
    {
        return (ASTSubscriptNode)this.getChild("Subscript");
    }

    public Token getASTTcolon()
    {
        return this.getChildToken("tcolon");
    }

    public ASTSubscriptNode getASTSubscript2()
    {
        return (ASTSubscriptNode)this.getChild("Subscript2");
    }

    public Token getASTTcolon2()
    {
        return this.getChildToken("tcolon2");
    }

    public ASTExprNode getASTExpr()
    {
        return (ASTExprNode)this.getChild("Expr");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTForallTripletSpecListNode(this); }
}
