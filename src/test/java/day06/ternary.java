package day06;

import java.util.Scanner;

public class ternary {
    static int stepCount ;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" pleaae tell me about your daily steps");

        stepCount = scan.nextInt();

    /**
        if ( stepCount > 10000) {
            System.out.println(" you runnung good per day");
        } else {
            System.out.println("you not running good just move");
        }

  */

// Ternary : variable = condition ? expressionTrue : expressionFalse ;

        String msg = stepCount > 10000? "running good" : "not good just run";

        System.out.println(msg);

    int no = 10==10? 10: 20;

    String a = "Mardin".equals("hakkari")? "yasa" : "ayip salladin";

    boolean b = 20 > 10 ? true : false;
    boolean oo = stepCount > 100 ? true : false;


    int nnn = 10 == 10 ? 10 : 13 ;
    }
}
