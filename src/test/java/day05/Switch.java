package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your cuty");
        String cityName = scan.next();

        // switch

        switch (cityName)
        {case " miami":
            System.out.println("Florida");
        break;
        case "denver" :
        System.out.println("colorodo");
        break;

            case " brooklyn":
                System.out.println("New York");
                break;

            default:
                System.out.println("your city not belongs USA teraority lol");

         }






    }
}
