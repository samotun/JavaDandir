package day10;

public class Mudur extends ArrayListt {


    // coonstructor
    // it is special method to initialize the OBJECT -> Mudur objectID = new Mudur();

    // Each class has a default constructor ( NO Parameters) , and you don't need to write it. but if you want you cantype it!

    Mudur(){
        // default constructor

    }


    Mudur (String str){
        // parameter constructor
        // we can create it. It is specific to call another object
        String l = "inlandOf";

    }

    Mudur (String city , int nbr){
      // parameter constructor
      // we create it . It is specific to call another object

      this.city = city;
      this.nbr = nbr;


    }
    int nbr = 10;

    String city = "denver";
    String state = "CO";
}
