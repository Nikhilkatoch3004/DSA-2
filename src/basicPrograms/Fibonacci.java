package basicPrograms;

public class Fibonacci {

    //Without Recursion
    public static void printFibo(int n) {
        int first = 0, second = 1;
        System.out.print("Fibo Sequence :" + first + " " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;

        }
    }

    //with Recusrsion
    public static int printFiboRec(int n) {
        if (n <= 1) {
            return 1;
        }
        return printFiboRec(n - 1) + printFiboRec(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci.printFibo(10);

        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(Fibonacci.printFiboRec(i) + " ");
        }
    }
}
