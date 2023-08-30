package day13;

import java.util.Scanner;

public class Prime2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter a positive number");


        int number = scan.nextInt();

    /*    String emrah = " denver";
        for ( int i = 2 ; i <number ; i++)
        { if ( number % i ==0){
            emrah = "NY";
            break;
        }

        } */

     /*   boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;

            }

        }
        System.out.println(isPrime? "prime" : " not prime");

*/

    /*    int some = 1;

        for ( int i = 2; i < number; i++){

            if (number % i ==0){

                some += 1;

            }

        }

        System.out.println(some==1? "prime": "not prime");

*/

        int count =0;

        if (number > 0) {
            if (number ==1){

                    System.out.println(" 1 is a prime number");

                } else  {

                    for ( int i = 2 ; i < number; i++){

                        if (number % i ==0){
                            count++;
                        }
                    } if ( count == 0){

                        System.out.println("it is prime");

                    } else {
                        System.out.println("it is not prime");
                    }
                }
            }
        }

    }





