package basicPrograms;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String n = sc.nextLine(); // Use nextLine() to allow spaces

        if (isPalindrome(n)) {
            System.out.println(n + " is a valid palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }

        sc.close(); // Close Scanner to prevent resource leak
    }
}
