// Generated by Ludwig version 1.0 alpha 6

package org.eclipse.photran.internal.core.parser;


/**
 * A production in the grammar
 */
public abstract class Production
{
    /**
     * Returns a string describing the production
     */
    public abstract String getDescription();

    abstract void reduce(Parser parser);

    public abstract int getNamedIndex(String name);

    public String toString()
    {
        return getDescription();
    }
}
