package basicPrograms;

public class Factorial {

    public static void fact(int n) {
        int count = 1;
        for (int i = n; i > 0; i--) {
            count = count * i;
        }
        System.out.println("Factorial is : " + count);
    }

    public static void main(String[] args) {

        Factorial.fact(5);
    }
}
