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
package org.eclipse.photran.internal.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.photran.internal.core.preferences.FortranPreferences;

/**
 * Top-level Fortran preference page
 * 
 * @author Jeff Overbey
 */
public class MainFortranPreferencePage extends AbstractFortranPreferencePage
{
    protected void setDescription()
    {
    }

    protected void initializeDefaults()
    {
        FortranPreferences.SHOW_PARSE_TREE.setDefault();
        FortranPreferences.ENABLE_VPG_LOGGING.setDefault();
    }

    @Override protected void createFieldEditors()
    {
        addField(new BooleanFieldEditor(FortranPreferences.SHOW_PARSE_TREE.getName(),
                                        Messages.MainFortranPreferencePage_0,
                                        getFieldEditorParent()));
        
        addField(new BooleanFieldEditor(FortranPreferences.ENABLE_VPG_LOGGING.getName(),
                                        Messages.MainFortranPreferencePage_1,
                                        getFieldEditorParent()));
    }
}