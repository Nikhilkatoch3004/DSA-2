package strings;

public class ReverseRecursion {

    public static String reverse(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);


    }

    public static void main(String[] args) {
        String str = "nikhil";
        System.out.println("Reversed String : " + reverse(str));
    }
}
