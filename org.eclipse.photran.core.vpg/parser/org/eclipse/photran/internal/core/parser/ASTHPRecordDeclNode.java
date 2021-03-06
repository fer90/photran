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
public class ASTHPRecordDeclNode extends ASTNode
{
    org.eclipse.photran.internal.core.lexer.Token hiddenTSlash; // in ASTHPRecordDeclNode
    org.eclipse.photran.internal.core.lexer.Token structureName; // in ASTHPRecordDeclNode
    org.eclipse.photran.internal.core.lexer.Token hiddenTSlash2; // in ASTHPRecordDeclNode
    IASTListNode<ASTEntityDeclNode> recordNamelist; // in ASTHPRecordDeclNode

    public org.eclipse.photran.internal.core.lexer.Token getStructureName()
    {
        return this.structureName;
    }

    public void setStructureName(org.eclipse.photran.internal.core.lexer.Token newValue)
    {
        this.structureName = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    public IASTListNode<ASTEntityDeclNode> getRecordNamelist()
    {
        return this.recordNamelist;
    }

    public void setRecordNamelist(IASTListNode<ASTEntityDeclNode> newValue)
    {
        this.recordNamelist = newValue;
        if (newValue != null) newValue.setParent(this);
    }


    @Override
    public void accept(IASTVisitor visitor)
    {
        visitor.visitASTHPRecordDeclNode(this);
        visitor.visitASTNode(this);
    }

    @Override protected int getNumASTFields()
    {
        return 4;
    }

    @Override protected IASTNode getASTField(int index)
    {
        switch (index)
        {
        case 0:  return this.hiddenTSlash;
        case 1:  return this.structureName;
        case 2:  return this.hiddenTSlash2;
        case 3:  return this.recordNamelist;
        default: throw new IllegalArgumentException("Invalid index");
        }
    }

    @Override protected void setASTField(int index, IASTNode value)
    {
        switch (index)
        {
        case 0:  this.hiddenTSlash = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 1:  this.structureName = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 2:  this.hiddenTSlash2 = (org.eclipse.photran.internal.core.lexer.Token)value; if (value != null) value.setParent(this); return;
        case 3:  this.recordNamelist = (IASTListNode<ASTEntityDeclNode>)value; if (value != null) value.setParent(this); return;
        default: throw new IllegalArgumentException("Invalid index");
        }
    }
}

