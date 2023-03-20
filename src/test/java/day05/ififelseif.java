package day05;

import java.util.Scanner;

public class ififelseif {
    public static void main(String[] args) {


        // if means condition:
        // if ( true) go inside the body

        // ask the user

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the positive number");

         int num = scan.nextInt();


         // just one line without condition without{}
        if (num>0)
            System.out.println(" great job");




        // just one line and one condition with {}
        if (num> 0){
            System.out.println("graat job dudelero");
        }



        // if -- else--if
        System.out.println("enetr your full name");

        String fullName = scan.nextLine();

        if ( fullName.equals("thomas alex")){
            System.out.println("you should pay");
        } else if (fullName.equals(" denver dino")) {
            System.out.println("you are great");


        } else {
            System.out.println( "I don't know who you are ");
        }

     // if -else-if

        System.out.println("enter the any positive or negative number");


        int number = scan.nextInt();
        if (number > 0 || number < 0) {
            System.out.println(" great job");
        } else {
            System.out.println(" wrong number .");

        }





    }


}
