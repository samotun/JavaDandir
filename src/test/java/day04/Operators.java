package day04;

public class Operators {
   /*
     +
     -
     *
     /
     % -> Module (Remainder-kalan)

        */

    public static void main(String[] args) {
        int nb1 = 10;
        int nmb2 = 20;
        int nmb3 = nb1 + nmb2;
        int nmr4 = nb1 * nmb2;// mutable

        String name = " awaze"; // immutable


        System.out.println(nb1 + nmb2);
        System.out.println(nmb3);
        System.out.println(nmr4);
        System.out.println(name + nb1 + nmb2);
        System.out.println(name + nb1 + nmb2);
        System.out.println(name + " " + "ln" + (nb1 + nmb2) + "ln");


// 1.way :  incremental and decremental
        nb1 = nb1 + 50;
        System.out.println("number1 :" + nb1);
        nmb2 = nmb2 - 5;
        System.out.println("number2 :" + nmb2);

        // 2.: incremental and decremental
        nb1 += 100;
        System.out.println("number 1 :" + nb1);
        nmb2 -= 5;
        System.out.println("num,ber 2 : " + nmb2);


        // 3.way incremental and decremental ( single digit by)
        nb1++;
        System.out.println("number 1 " + nmb2);
        nmb2--;
        System.out.println("number 2 :" + nmb2);


// Modulus: It is used to find the remainder
        System.out.println(20 % 4);
        System.out.println(20 % 3);


        System.out.println("last nmb1 : " + nb1);
        int newnumber = nb1 / 10;
        double newNumber2 = nb1 / 10;

        System.out.println(newnumber);
        System.out.println(newNumber2);


/**
 "=" : Assaignment operator : it takes the valuye on right and puts it into the contanier on the left

 "=="  Means Equal           , returns boolean

 "!" means NOT Equal        , returns boolean

 "<" , ">" , "<=" , ">="      : all returns boolean
 "&&"  : And operator , If yoy have at least one  false , then result would be false

 "||"  : OR  Operator :  if you at least one of true the result would be true


 */
        int a = 12;
        System.out.println(5 == 2 + 3); // true
        System.out.println(5 == 2 - 3); // false


        System.out.println(5 != 3 * 4);//true
        System.out.println(5 != 2 + 3); // false

        System.out.println(5 >= 2 + 3); // true

        boolean b1 = 5 > 2; //true
        // boolean b1 = true;
        boolean b2 = 5 == 2 + 3;    // true
        boolean b3 = 5 == 2; // false
        boolean b4 = 5 < 2; //false


        // to get true from && everything must be true. && is perfectionist.
        System.out.println(b1 && b2); // true
        System.out.println(b1 && b2 && b3);// false
        System.out.println(b4 && b3);// false

        // to get false from || , everything must be false
        System.out.println(b1 || b2 || b3); //true
        System.out.println(b4 || b2 || b3 || b3 || b4); // true


    }

}
