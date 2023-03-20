package day09;

public class Teacher {

   String name = "unkownname" ;
   String lastName = "unkown Lastname";

   String subject = "unkown subject ";


    public static void main(String[] args) {

        Teacher teach = new Teacher(" osman" , "osman" , " mehmet");

        System.out.println(teach.name + " ");
        System.out.println(teach.lastName + " ");
        System.out.println(teach.subject + " ");
    }

    public Teacher () {


    }

    public Teacher (String isim, String soyad , String bolum){


        this.name = isim;
        this.lastName =soyad;
        this.subject = bolum;

    }

}
