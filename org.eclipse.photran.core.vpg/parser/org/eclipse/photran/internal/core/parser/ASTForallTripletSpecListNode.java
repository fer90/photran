/*******************************************************************************
 * Copyright (c) 2007 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UIUC - Initial API and implementation
 *******************************************************************************/
package org.eclipse.photran.internal.core.parser;

import java.io.PrintStream;
import java.util.Iterator;

import java.util.List;

import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTNodeWithErrorRecoverySymbols;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IASTVisitor;
import org.eclipse.photran.internal.core.lexer.Token;

import org.eclipse.photran.internal.core.lexer.*;                   import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;                   import org.eclipse.photran.internal.core.SyntaxException;                   import java.io.IOException;

@SuppressWarnings("all")
public class ASTForallTripletSpecListNode extends ASTNode
{
    org.eclipse.photran.internal.core.lexer.Token hiddenTComma; // in ASTForallTripletSpecListNode
    ASTNameNode name; // in ASTForallTripletSpecListNode
    org.eclipse.photran.internal.core.lexer.Token hiddenTEquals; // in ASTForallTripletSpecListNode
    ASTSubscriptNode lb; // in ASTForallTripletSpecListNode
    org.eclipse.photran.internal.core.lexer.Token hiddenTColon; // in ASTForallTripletSpecListNode
    ASTSubscriptNode ub; // in ASTForallTripletSpecListNode
    org.eclipse.photran.internal.core.lexer.Token hiddenTColon2; // in ASTForallTripletSpecListNode
    IExpr stepExpr; // in ASTForallTripletSpecListNode

    public ASTNameNode getName()
    {
        return this.name;
    }

    public void setName(ASTNameNode newValue)
    {
        this.name = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    public ASTSubscriptNode getLb()
    {
        return this.lb;
    }

    public void setLb(ASTSubscriptNode newValue)
    {
        this.lb = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    public ASTSubscriptNode getUb()
    {
        return this.ub;
    }

    public void setUb(ASTSubscriptNode newValue)
    {
        this.ub = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    public IExpr getStepExpr()
    {
        return this.stepExpr;
    }

    public void setStepExpr(IExpr newValue)
    {
        this.stepExpr = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    @Override
    public void accept(IASTVisitor visitor)
    {
        visitor.visitASTForallTripletSpecListNode(this);
        visitor.visitASTNode(this);
    }

    @Override protected int getNumASTFields()
    {
        return 8;
    }

    @Override protected IASTNode getASTField(int index)
    {
        switch (index)
        {
        case 0:  return this.hiddenTComma;
        case 1:  return this.name;
        case 2:  return this.hiddenTEquals;
        case 3:  return this.lb;
        case 4:  return this.hiddenTColon;
        case 5:  return this.ub;
        case 6:  return this.hiddenTColon2;
        case 7:  return this.stepExpr;
        default: throw new IllegalArgumentException("Invalid index");
        }
    }

    @Override protected void setASTField(int index, IASTNode value)
    {
        switch (index)
        {
        case 0:  this.hiddenTComma = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 1:  this.name = (ASTNameNode)value; if (value != null) value.setParent(this); return;
        case 2:  this.hiddenTEquals = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 3:  this.lb = (ASTSubscriptNode)value; if (value != null) value.setParent(this); return;
        case 4:  this.hiddenTColon = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 5:  this.ub = (ASTSubscriptNode)value; if (value != null) value.setParent(this); return;
        case 6:  this.hiddenTColon2 = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 7:  this.stepExpr = (IExpr)value; if (value != null) value.setParent(this); return;
        default: throw new IllegalArgumentException("Invalid index");
        }
    }
}

