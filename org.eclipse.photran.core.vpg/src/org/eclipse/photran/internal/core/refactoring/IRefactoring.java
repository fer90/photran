/*******************************************************************************
 * Copyright (c) 2009 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    UIUC - Initial API and implementation
 *******************************************************************************/
package org.eclipse.photran.internal.core.refactoring;

/**
 * Common super-interface for {@link IResourceRefactoring} and {@link IEditorRefactoring}.
 *
 * @author Jeff Overbey
 *
 * @see IResourceRefactoring
 * @see IEditorRefactoring
 */
public interface IRefactoring
{
    /**
     * Returns the name of this refactoring, suitable for display to the user.
     * <p>
     * All important words should be capitalized, for example, "Extract Method", "Convert Member
     * Type to Top Level", etc.
     * <p>
     * This name will be shown in the title bar of the refactoring wizard dialog and in the
     * Edit &gt; Undo menu item.  It may also be used as the refactoring's label in the Refactor
     * menu (if it is not assigned a different label in <tt>plugin.xml</tt>).
     * <p>
     * This method is also required by the Eclipse LTK <code>Refactoring</code> class.
     *
     * @return the refactoring's human-readable name (non-<code>null</code>)
     */
    String getName();
}
