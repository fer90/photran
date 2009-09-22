program program1
use module2
use module3
use module4, only: help_common4
use module5
implicit none

common /block/ a, b, c, /mem/ r, f, t
integer :: a
real :: b
double precision :: c

integer :: r, f, t

a = 5
b = 4.6
c = 2.345

call helper
end program program1

subroutine helper
implicit none
common /block/ e, f, g
integer :: e
real :: f
double precision :: g
end subroutine helper