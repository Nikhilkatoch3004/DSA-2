package basicPrograms;

import java.util.Scanner;

public class PrimeNumbers {

    public void printPrime(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + "--");
                count++;
            }
            num++;
        }
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        PrimeNumbers pn = new PrimeNumbers();
        pn.printPrime(n);
        sc.close();
    }
}
