/*******************************************************************************
 * Copyright (c) 2009 University of Illinois at Urbana-Champaign and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     UIUC - Initial API and implementation
 *******************************************************************************/
package org.eclipse.photran.internal.tests.vpg;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.tests.Activator;
import org.eclipse.photran.internal.tests.PhotranWorkspaceTestCase;

/**
 * Unit tests for {@link PhotranVPG#listAllModules()}
 *
 * @author Jeff Overbey
 */
public class ListAllModulesTests extends PhotranWorkspaceTestCase
{
    private static final String DIR = "vpg-test-code/list-modules";

    @Override public void setUp() throws Exception
    {
        super.setUp();

        /* The files are imported in this order so that the USE
         * statement in use-module1.f90 is seen /before/
         * the module declaration, while the USE statement for
         * module 4 is seen after it.  Module2 and module3
         * are not used.
         */

        importFile(Activator.getDefault(), DIR, "use-module1.f90");
        importFile(Activator.getDefault(), DIR, "module1.f90");
        importFile(Activator.getDefault(), DIR, "module2-module3.f90");
        importFile(Activator.getDefault(), DIR, "module4.f90");
        importFile(Activator.getDefault(), DIR, "use-module4.f90");
        PhotranVPG.getInstance().ensureVPGIsUpToDate(new NullProgressMonitor());
        //PhotranVPG.getDatabase().printOn(System.out);
    }

    public void testListAllModules() throws Exception
    {
        assertCollectionsEqual(
            new String[] { "module1", "module2", "module3", "module4" },
            PhotranVPG.getInstance().listAllModules());
    }
}
