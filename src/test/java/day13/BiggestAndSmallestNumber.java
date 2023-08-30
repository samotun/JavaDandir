package day13;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestAndSmallestNumber {


    public static void main(String[] args) {

     // create a function that takes an array and returns the difference between the biggest and smallest numbers.
     // ask user to enter array elements

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a array");

        int length = scan.nextInt();


        int [] array = new int[length];


        System.out.println("please enter an array element");

        for(int i = 0; i < length; i++){

            array[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int difference = array[array.length-1] - array[0];
        System.out.println(difference);
        scan.close();
    }
}
