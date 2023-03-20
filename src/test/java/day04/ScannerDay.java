package day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDay {

    public static void main (String [] args) {} {

        /*
        Scanner class ti get data from user

        * First we need create a OBJECT from class:

        Scanner scan  = new  Scanner (System.in)
       ( ClassName ) ( ObjectNme) "=" ClassName( constructor) ;

         */
    Scanner scan = new Scanner(System.in);

        System.out.println(" please enter your name");
        String inputUser = scan.nextLine();
        System.out.println(" your name is : " + inputUser);

        System.out.println("please enter your SSN no ");
        int ssnno = scan.nextInt();
        System.out.println(" your ssn no is :" + ssnno);


// Primitive data Type do NOT manipulated
        int nbr = 2;



// reference data type can be manupilated

    String name = " Denver";
        System.out.println(name);
        System.out.println(name.toLowerCase());


// String is immutable! for security purpose
        String city = "NEW YORK";
        city.toLowerCase(); // "new york"
        System.out.println(city); //" NEW YORK"
        System.out.println(city.toLowerCase()); //"new york"













    }


}
