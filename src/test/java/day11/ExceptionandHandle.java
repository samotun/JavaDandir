package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionandHandle {



    public static void main(String[] args)  throws FileNotFoundException {

        // checked Exceptions
        // unchecked Exceptions
        int a = 10;
        int b= 0;

        try{

            System.out.println(a/b);
        } catch (ArithmeticException e )
        {

            e.printStackTrace();
        }
        finally {
            System.out.println(" always works");
        }


        String filePath = " src/ExceptionsfileInputStream/file";
        FileInputStream file = new FileInputStream(filePath);


        System.out.println("code is running");
    }
}
