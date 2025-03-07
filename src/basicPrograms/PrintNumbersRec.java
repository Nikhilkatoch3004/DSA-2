package basicPrograms;

import java.util.Scanner;

public class PrintNumbersRec {
    static int i = 0;

    static void printNum(int n) {

        if (i <= n) {
            System.out.print(i + " ");
            i++;
            printNum(n);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        PrintNumbersRec.printNum(num);

    }
}
