package strings;

import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String nstr = " ";
        for (int i = 0; i < str.length(); i++) {
            nstr = str.charAt(i) + nstr;
        }
        System.out.println("Reversed String : " + nstr);
    }
}
