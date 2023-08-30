package day11;

import java.util.Arrays;

public class Str {


    public static void main(String[] args) {









        String str = " http://www.snapshot/wer/selek/112121";
        String[] values = str.split("/");

        String [] values2 = str.split("selek/");


        System.out.println(Arrays.toString(values));

        System.out.println(Arrays.toString(values2));
        String jobId = values2[1];
        System.out.println("jobId ;" + jobId);

    }
}
