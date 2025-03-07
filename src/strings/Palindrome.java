package strings;

import java.util.Scanner;

import static basicPrograms.Palindrome.isPalindrome;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " : String is a Palindrome.");
        } else {
            System.out.println(str + " : String is Not a Palindrome.");
        }
    }
}
