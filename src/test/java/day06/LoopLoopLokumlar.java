package day06;

import java.util.Scanner;

public class LoopLoopLokumlar {

    public static void main (String[]args) {

// 1). way:
        // print hello world 10 times in console
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");


// for loop

        for (int i =10; i <20; i+=3 ) {
            System.out.println(+i);
        }
        System.out.println("ln");




        // Nested Loops;

        for (int i = 1; i < 4; i++) {
            for (int j = 5; j < 9; j++) {
                System.out.println(i + " - " + j);
            }
        }


        // while loop:

        int number =10;
        while (number <20 ){
            System.out.println(number);
            number++;
        }


 // do while:
       int numberr ;
       int atttempt = 3;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your password");
            numberr = scan.nextInt();
            if (numberr == 1212) {
                System.out.println("your paaword is coorect");
            } else {
                System.out.println("wrong password, go home");
            }
            atttempt--;
            System.out.println(atttempt);

        } while (numberr != 1212 && atttempt != 0);

        System.out.println("go go go home");













    }
    }
