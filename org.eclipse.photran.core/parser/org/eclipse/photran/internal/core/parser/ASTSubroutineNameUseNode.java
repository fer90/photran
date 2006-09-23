// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;

import org.eclipse.photran.internal.core.lexer.Token;


/**
 * <SubroutineNameUse> ::= tident:T_IDENT 
 */
public class ASTSubroutineNameUseNode extends ParseTreeNode
{
    public ASTSubroutineNameUseNode(Nonterminal nonterminal, Production production)
    {
        super(nonterminal, production);
    }

    public Token getASTTident()
    {
        return this.getChildToken("tident");
    }

    protected void visitThisNodeUsing(ASTVisitor visitor) { visitor.visitASTSubroutineNameUseNode(this); }
}