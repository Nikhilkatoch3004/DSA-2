package basicPrograms;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        a = a + b; // 2 + 3 = 5
        b = a - b; // 5 - 3 = 2
        a = a - b; // 5 - 2 = 3
        System.out.println("First number : " + a + " , Second Number : " + b);
    }
}
