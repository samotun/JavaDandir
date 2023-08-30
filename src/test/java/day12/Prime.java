package day12;

import java.util.Scanner;

public class Prime {

    // enter a positive Integer to  check if it is prime or not?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nbr = scan.nextInt();
        primeCalculator(nbr);
        scan.close();


    }

    private static void primeCalculator(int nbr) {

        int count = 0;
        if (nbr > 0) {
            if (nbr == 1) {
                System.out.println(nbr + "is a prime number");


            } else {
                for (int i = 2; i < nbr; i++) {

                    if (nbr % i == 0)
                        count++;
                }
            }
            if (count == 0) {
                System.out.println(nbr + " is a prime");


            } else {
                System.out.println(nbr + " is not a prime");

            }
        } else {
            System.out.println("enter a positive number");

        }
    }

}