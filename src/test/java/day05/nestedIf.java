package day05;

import java.util.Scanner;

public class nestedIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // char ch = 'A';

        System.out.println(" enter your age ");
        int age = scan.nextInt();

        System.out.println("enter your gender M or F "); // male -> MALE -> M  == and !=
        char gender = scan.next().toUpperCase().charAt(0);


        if (age < 0) {
            System.out.println(" i think your still on the way!");

        } else if (!(gender == 'M' || gender == 'F')) ;
        {
            System.out.println("what is gender dude");
        }

        if (gender == 'M')

            if (age > 65) {
                System.out.println(" you should die. Retired");

            } else {
                System.out.println(" you should tax!");
            }
            else if (gender == 'F') {
                if (age > 60) {
                    System.out.println(" tou shpud be happ after retired");
                } else {
                    System.out.println(" work more for paying TAX");
                }


            }
// fix the format --> ctrl  + alt + L
// fix the import --> ctrl + alt + o
        }
    }