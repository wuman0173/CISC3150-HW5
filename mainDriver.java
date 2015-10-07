/*
Benjamin Wu
CISC 3150
HW5 Question 1

Comments: The Main Driver is trying to access the protect int, not the subclass.Thats why there is the "cannot access protected variable error"
But inside the subclass, theChild, it itself can access it.

Sources: 
http://stackoverflow.com/questions/23519018/how-to-access-a-protected-variable-from-another-package

http://stackoverflow.com/questions/19949327/why-subclass-in-another-package-cannot-access-a-protected-method

http://stackoverflow.com/questions/18560341/accessing-protected-variable-of-an-instance-of-a-class-that-extends-an-abstract

*/

import parentpackage.*;
import theChild.*;

class mainDriver
{
        public static void main(String[] args)
        {
        System.out.println("Hi from mainDriver. ");
//      ParentYO hello = new ParentYO();
        theChild hello2 = new theChild();
//      System.out.println(hello2.x); This is giving the "cannot access protected variable error" This is the error we get from class.
        hello2.printout();
//This is the public method that accesses the protected int from its parent. This is the subclass that allows itself to access the protected int, not the mainDriver, which is not a subclass.
        }
}
