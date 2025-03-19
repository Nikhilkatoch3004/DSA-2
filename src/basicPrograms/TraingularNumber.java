package basicPrograms;

import java.util.Scanner;

//Find the Closet Traingular Number to Given Number
public class TraingularNumber {
    public static int findNumber(int num) {

        int n = 1; // Initialize the starting triangular number index
        int triangularNumber = 1; // First triangular number is 1

        // Generate triangular numbers until exceeding num
        while (triangularNumber <= num) {
            n++;
            triangularNumber = (n * (n + 1)) / 2;
        }
        // Return the largest triangular number less than or equal to num
        return ((n - 1) * n) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println("Closest Number is : " + TraingularNumber.findNumber(num));
    }
}
