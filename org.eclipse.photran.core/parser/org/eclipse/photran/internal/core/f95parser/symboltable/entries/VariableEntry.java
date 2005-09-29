package org.eclipse.photran.internal.core.f95parser.symboltable.entries;

import org.eclipse.photran.internal.core.f95parser.Nonterminal;
import org.eclipse.photran.internal.core.f95parser.ParseTreeNode;
import org.eclipse.photran.internal.core.f95parser.Token;
import org.eclipse.photran.internal.core.f95parser.symboltable.SymbolTable;
import org.eclipse.photran.internal.core.f95parser.symboltable.SymbolTableEntry;
import org.eclipse.photran.internal.core.f95parser.symboltable.SymbolTableError;
import org.eclipse.photran.internal.core.f95parser.symboltable.SymbolTableType;
import org.eclipse.photran.internal.core.f95parser.symboltable.SymbolTableVisitor;

/**
 * Symbol table entry for a variable
 * 
 * @author joverbey
 */
public class VariableEntry extends SymbolTableEntry
{
    public VariableEntry(SymbolTable parentTable, Token identifier, ParseTreeNode correspondingParseTreeNode)
    {
        super(parentTable, identifier, correspondingParseTreeNode);
        
        if (correspondingParseTreeNode.getRootNonterminal() != Nonterminal.XCOMPONENTNAME
            && correspondingParseTreeNode.getRootNonterminal() != Nonterminal.XFUNCTIONPAR
            && correspondingParseTreeNode.getRootNonterminal() != Nonterminal.XNAME
            && correspondingParseTreeNode.getRootNonterminal() != Nonterminal.XSUBROUTINEPAR
            && correspondingParseTreeNode.getRootNonterminal() != Nonterminal.XOBJECTNAME)
            throw new SymbolTableError("The ParseTreeNode passed to the VariableEntry constructor should be one of the following: xComponentName, xFunctionPar, xName (if in the RESULT clause of a function), xSubroutinePar, xObjectName");
    }

    public String getTypeDescription()
    {
        if (type == null)
        {
            if (isFunctionResult())
            {
                SymbolTableEntry parentTableEntry = parentTable.getParentEntry();
                if (parentTableEntry == null) return "Variable, type unknown";
                
				SymbolTableType returnType = ((FunctionEntry)parentTableEntry).getReturnType();
                if (returnType == null) return "Variable, type unknown";
				
				return returnType.getDescription();
            }
            else
                return "Variable, type unknown";
        }
        else
            return type.getDescription();
    }

    public void visitEntryUsing(SymbolTableVisitor visitor)
    {
        visitor.visit(this);
    }
    
    private SymbolTableType type = null;
    public SymbolTableType getType()
    {
        return type;
    }
    public void setType(SymbolTableType type)
    {
        this.type = type;
    }
    
    private boolean isFunctionResult = false;
    public boolean isFunctionResult()
    {
        return isFunctionResult;
    }
    public void setFunctionResult(boolean isFunctionResult)
    {
        this.isFunctionResult = isFunctionResult;
    }
    
    private boolean isFunctionOrSubroutineParameter = false;
    public boolean isFunctionOrSubroutineParameter()
    {
        return isFunctionOrSubroutineParameter;
    }
    public void setFunctionOrSubroutineParameter(boolean isFunctionOrSubroutineParameter)
    {
        this.isFunctionOrSubroutineParameter = isFunctionOrSubroutineParameter;
    }
}
