package alteratest;

import java.util.Scanner;

public class BitSet {
    public static int setBits(int num) {
        int count = 0;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            if (num % 2 != 0) count++;
            num = num / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println("Number of Set Bits are : " + BitSet.setBits(num));
    }
}
