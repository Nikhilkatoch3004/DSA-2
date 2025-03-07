package strings;

import java.util.Scanner;

public class PrintTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String nstr = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                nstr = nstr + str.charAt(i);
            } else {
                nstr = nstr + str.charAt(i) + str.charAt(i);
            }
        }

        System.out.println("New String is : " + nstr);
    }
}
