package day02;

public class Field_Method_DataType_ {

    /**

    1)   Field / Variable =>
        Int A = 115;
             int: field data type
                 A : filed name
                         115 : field value

    2)  Method / Function =>


        void number ( )  { }


        NOTE :

        * Package name starts with lowercase
        * class name starts with  uppercase
        * we use camel method for name => selmanOtunMardinNyc

        */


    // Datatype : primitive Datatypes and non-primitive/ reference

    // A) we have 8 primitive data types:

    // character:
    char ch1 = 'a';
     char ch ='3';
    char ch3 = '%';


    // True or False

    boolean bl1 = true ;
    boolean bl2 = false;


    // whole number:  byte < short < int < long
    byte by = 12;
    short sh = 1212;
    int in = 12323232;
    long lg = 342453424;


    // Decimal Number: float < double
    float fl = 15.23f;
    double dl = 123.414566756347;



    // common primitive data type:
    // char, boolean, int, double


    // B) Non- Primitive : String
    String nameCity = "Denver";
    String name2 = "15";
    String name3 = "^%^^%$$%%^^^&&&&&*&;" ;

    static String name1 = " 314252&^7#$^&(*^";
    String  nm1 = "emrah" , nm2 = "tugce" , nm3 = "selman";

    int n1 = 5, n2 = 4;



    // METHOD ? FUNCTION
    public static void main(String[] args) {




        mt1();

        System.out.println(mt2());
        System.out.println(mt3());
        System.out.println(mt4());


        String nameSam1 = " selman";
        mt5(nameSam1);
        mt5(name1);
        //System.out.println(nameSam);



    }

static String mt5 (String nameSam ){

        return nameSam;
}
       // public accesss modifier
    // static: key heryerde kullnabilmek icin ve hafixada cok yer kaplamak icin kullamnilir
    // ** void : method return type ( data type)
    // ** main: Method name
    // ** () : parameters
    //** {}  method body

    static void mt1(){
        System.out.println("mt1");
        System.out.println("mt1");
        System.out.println("mt1");
        System.out.println("mt1");

    }

static String mt2() {
        return "mt2-name";

}

static int mt3() {

        return 3;
}

      static boolean mt4 ( ) {
        return true ;
}

   char ch1 () {
        return 'a';
   }





}














































