package org.eclipse.photran.internal.tests.refactoring.rename;

import junit.framework.Test;

import org.eclipse.photran.internal.core.util.LineCol;

public class RenameBug278324 extends RenameTestSuite
{
    ///////////////////////////////////////////////////////////////////////////
    //
    // RECORD POSITIONS OF ALL IDENTIFIERS IN BUG278324.F90
    //
    ///////////////////////////////////////////////////////////////////////////
    
    private String file = "bug278324.f90";

    private Ident parmValFormat = var("parmValFormat");
    
    ///////////////////////////////////////////////////////////////////////////
    //
    // TEST CASES
    //
    ///////////////////////////////////////////////////////////////////////////
    
    public static Test suite() throws Exception
    {
        return new RenameBug278324();
    }
    
    public RenameBug278324() throws Exception
    {
        parmValFormat.addReferences(file, new LineCol[] { lc(3,25), lc(5,11), lc(6,15) });

        startTests("Renaming file exercising Bug 278324");
        addSuccessTests(parmValFormat, "something_else");
        endTests();
    }
}
