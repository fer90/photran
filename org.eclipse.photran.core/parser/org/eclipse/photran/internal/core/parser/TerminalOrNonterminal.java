// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * Common superclass for Terminal and Nonterminal
 */
public abstract class TerminalOrNonterminal
{
    public abstract String getDescription();

    abstract int getNumberOfSymbolsOnValueStack();
}
