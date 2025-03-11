package optiveTest;

public class ExceptionsDemo {

    public static int test() {
        try {
//            int a = 10 / 0;
            System.out.println("Try Block");
            throw null;
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
//            System.exit(0);

        } finally {
            System.out.println("Final Block");
            return 200;
        }

    }

    public static void main(String[] args) {

        System.out.println(ExceptionsDemo.test());
    }
}
