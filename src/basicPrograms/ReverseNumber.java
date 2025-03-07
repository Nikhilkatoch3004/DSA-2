package basicPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int rev = 0, var = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Reverse of Number : " + num);
            return;
        }
        //3456
        while (num > 0) {
            var = num % 10;
            rev = 10 * rev + var;
            num = num / 10;
        }

        System.out.println("Reversed Number is : " + rev);
    }
}
