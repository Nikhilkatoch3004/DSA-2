package strings;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = sc.next();
        System.out.print("Enter Second String : ");
        String str2 = sc.next();

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("First String is : " + str1 + "\n" + "Second String is : " + str2);

    }
}
