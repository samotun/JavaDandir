package day10;

public class Mother   {

    // less secure
    public String namePublic = "public";
    protected String nameProtected="protected";

    // more secure
    String nameDefault  = "baba"; // default access modifier
    private String namePrivate = "private";


    //less secure
    public static String namePublic2 = "public";
    protected static String nameProtected2= "protected";


    // More secure

    static String nameDefault2 = "baba";
    private static String namePrivate2 = "Private";


}
