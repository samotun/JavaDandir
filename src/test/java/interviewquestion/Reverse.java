package interviewquestion;

public class Reverse {
    public static void main(String[] args) {
        String name = "I am learning java";
        String str = "New YorK";
        String city = "Brooklyn";
        StringBuilder object = new StringBuilder();
        object.append(name);
        String newObject = String.valueOf(object.reverse()); // first reversed
        System.out.println(newObject);
        String newObject2= object.reverse().toString();// reverse the reversed one again
        System.out.println(newObject2);

        System.err.println(reverseName(name));
    } // second way with Method
    public static String reverseName(String name){
        String reverse="";

        for( int i = name.length()-1; i >=0; i--){
            reverse += name.charAt(i);

        }
        return reverse;
    }
}
