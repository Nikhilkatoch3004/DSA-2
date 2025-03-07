package basicPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Sum = " + num);

        } else if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum = " + sum);
    }
}
