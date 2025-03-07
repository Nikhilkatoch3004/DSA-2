package basicPrograms;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            num = num * -1;
        } else if (num == 0) {
            System.out.println("Number of Digits =  1");
            return;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of Digits are : " + count);


    }
}
