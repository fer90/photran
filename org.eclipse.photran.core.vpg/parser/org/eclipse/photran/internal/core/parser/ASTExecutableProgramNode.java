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

import java.util.List;

import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.parser.Parser.CSTNode;
import org.eclipse.photran.internal.core.parser.Parser.Production;

public class ASTExecutableProgramNode extends ScopingNode
{
    protected int count = -1;

    ASTExecutableProgramNode(Production production, List<CSTNode> childNodes, List<CSTNode> discardedSymbols)
    {
         super(production);
         
         for (Object o : childNodes)
             addChild((CSTNode)o);
         constructionFinished();
    }

    /**
     * @return the number of ASTExecutableProgramNode nodes in this list
     */
    public int size()
    {
        if (treeHasBeenModified()) throw new IllegalStateException("Accessor methods, including size(), cannot be called on the nodes of a CST after it has been modified");
        
        if (count >= 0) return count;
        
        count = 0;
        ASTExecutableProgramNode node = this;
        do
        {
            count++;
            node = node.getRecursiveNode();
        }
        while (node != null);
        
        return count;
    }
    
    ASTExecutableProgramNode recurseToIndex(int listIndex)
    {
        ASTExecutableProgramNode node = this;
        for (int depth = size()-listIndex-1, i = 0; i < depth; i++)
        {
            if (node == null) throw new IllegalArgumentException("Index " + listIndex + " out of bounds (size: " + size() + ")");
            node = (ASTExecutableProgramNode)node.getRecursiveNode();
        }
        return node;
    }
    
    @Override protected void visitThisNodeUsing(ASTVisitor visitor)
    {
        visitor.visitASTExecutableProgramNode(this);
    }

    public ASTProgramUnitNode getProgramUnit(int listIndex)
    {
        if (treeHasBeenModified()) throw new IllegalStateException("Accessor methods cannot be called on the nodes of a CST after it has been modified");

        ASTExecutableProgramNode node = recurseToIndex(listIndex);
        if (node.getProduction() == Production.EXECUTABLE_PROGRAM_1)
            return (ASTProgramUnitNode)node.getChild(0);
        else if (node.getProduction() == Production.EXECUTABLE_PROGRAM_2)
            return (ASTProgramUnitNode)node.getChild(1);
        else
            return null;
    }

    private ASTExecutableProgramNode getRecursiveNode()
    {
        if (treeHasBeenModified()) throw new IllegalStateException("Accessor methods cannot be called on the nodes of a CST after it has been modified");

        if (getProduction() == Production.EXECUTABLE_PROGRAM_2)
            return (ASTExecutableProgramNode)getChild(0);
        else
            return null;
    }
}