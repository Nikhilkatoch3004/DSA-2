package basicPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if (isPlaindrome(num)) {
            System.out.println(num + " : Number is Palindrome.");
        } else {
            System.out.println(num + " Number is not Palindrome.");
        }
    }

    private static boolean isPlaindrome(int num) {
        int rev = 0, var = 0, origional = num;
        if (num == 0) {
            return true;
        }
        while (num > 0) {
            var = num % 10;
            rev = 10 * rev + var;
            num = num / 10;
        }
        if (origional == rev) return true;

        return false;
    }
}
