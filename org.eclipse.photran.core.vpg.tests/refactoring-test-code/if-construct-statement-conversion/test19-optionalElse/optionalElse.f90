program convertIfStatementToIfConstructWithOptionalElseBlock
    implicit none
    integer :: var1, var2
    print *, "This is an if construct example."
    var1 = 4
    var2 = 5
    if (var1 < var2) print *, var1, " is less than ", var2, " using if-stmt." !<<<<< 7, 5, 7, 78, IfStmtToIfConstruct, TRUE, pass
    
    !!! This test shows the refactoring successfully converting a valid IF statement to a valid IF construct, and then based
    !!! on the user's affirmative selection of the option, will add on an else construct block to the end of it.
end program