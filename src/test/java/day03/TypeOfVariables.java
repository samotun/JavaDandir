package day03;

public class TypeOfVariables {

    /*

     TYPES OF VARIABLES (FIields):

     In java there are 3 types of variables

     local variables
     Instance variables
     Static variables



     1) Local variables:
     local variables are variable that declared inside the body of a method


     2) Instance Variables: ( non-Static field) :
     Instance variables are defined without the STATIC keyword.
     They are defined outside of body of method. they are object seficific and are known as instance variables.


     3) Static Variables:
     Static Variables are initialized only once, at the start of program execution.
     these variables should be initiliazed first, before the initialzitaion of ant instance variables.

     example : Types of variables in java


     public class Girigiri{

        static int a = 1; // instance variables
        int data = 99;// instance variable


     void method () {

     int b = 90; //local variables



     }

     }


     4) Global Variables:
     Global variables are the variables that can be accessed anywhere in the java program.
     Java being a strictly object-oriented programming language doesn't have the concept of a global variable.
     But by using static, public and final keywords, a variable can have all the functionality of a global variable.
     Global Variable; There is no direct concept of global variable in java, but you implement the same in different number of ways.
     A)  With the help of static keyword and public access modifier.
     public class GlobalVariable {
     public static int MAX_SIZE = 1000;
     public static int MIN_SIZE = 1;
     public static final String DENVER = "DENVER";
     }
     Now you can access MAX_SIZE and MIN_SIZE from anywhere by calling like this
     globalVariable.MAX_SIZE
     globalVariable.MIN_SIZE
     B) With the help of interface
     public interface GlobalVariable1 {
     // Variable are implicitly public, static, and final
     int MAX_SIZE = 1000;
     int MIN_SIZE = 1;
     }
     Any class that needs to use these, can implement the interface.
     public class GlobalVariable1Demo implements GlobalVariable1{
     public static void main(String[] args) {
     System.out.println("Max Size :"+MAX_SIZE);
     System.out.println("Max Size :"+MIN_SIZE);
     }
     }
     The static modifier, in combination with the final modifier, is also used to define constants. The final modifier indicates that the value of this field cannot change.
     */



























}
