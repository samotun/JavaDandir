package day8;


import java.util.Arrays;

public class ArrayMan {


    // access modifier:

    public static String name = "gariban";
    private String name2 = " Garibanolc";

    protected String name3 = "Gariban";

    String name4 = "gari"; // this fiels already default access modifier. you don't need need to write it!


    // Overloadding Method:

    int totalTax() {
        return 10000;
    }

    int totalTAx(int income) {
        return 10 + income;
    }


    int totalTAx(int income, int expense) {
        return 10 + income - expense;
    }


    public static void main(String[] args) {

     /*
      Array :
      1) arrays are used to store multiple datas in a sungle contanier.

      2) In an array all elements must be in same data type
      3) You can't change the array length if you create previous array

      */

        String n1 = " inland";
        String n2 = " JBL";

        String[] nlist = new String[4]; // length is 2
        String foodList[] = new String[3];
        int[] nbr = new int[6];

        nlist[0] = "denver";
        nlist[1] = "colarado";

        nbr[0] = 10;
        nbr[1] = 1;
        nbr[2] = 20;
        nbr[3] = 30;


        System.out.println(nlist[0]);
        System.out.println(Arrays.toString(nlist));
        System.out.println(Arrays.toString(nbr));
// ArrayIndexOutBoundsException: Index 5 out of bounds for length 4
        // System.out.println(nbr[5]);


// 2) Second way to create Array:

        String[] newlist = {"colorado spring", "loveland skii resort", "selman sevmiyii snowboard"};
        int[] nbr2 = {23, 34, 34, 43, 54};

        System.out.println(newlist[1]);
        System.out.println(Arrays.toString(newlist));

// Split Method: we create an Array with String
        String nba = "Nuggets, lakers, nets,heat";

        String[] nbalist = nba.split(",");

        System.out.println(Arrays.toString(nbalist));
        System.out.println("it is winner team : " + nbalist[1] + "------" + " it is looser team : " + nbalist[0]);

        for (int i = 0; i < nbalist.length; i++) {
            System.out.println("for loop: " + nbalist[i]);
        }

        for (String foreachelement : nbalist) {
            System.out.println("foreach : " + foreachelement);
        }

        int[] salary = {1000000, 2000000, 0};

        for (int checkeveryeachpersonsalary : salary) {
            System.out.println("checkeveryeachpersonsalary: " + checkeveryeachpersonsalary);
        }

        // multidimension Array


        int[][] nbrr = {{12, 34}, {44, 56}};
        {
            System.out.println(nbrr[0][0]);
            System.out.println(nbrr[0][1]);
            System.out.println(nbrr[1][0]);


        }
    }


}


