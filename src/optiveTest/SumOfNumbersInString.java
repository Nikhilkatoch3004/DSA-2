package optiveTest;


public class SumOfNumbersInString {

    public static int sumOfNumbers(String str) {
        int sum = 0;
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Constructing the number
            } else {
                sum += num; // Add the previous number to sum
                num = 0;    // Reset number
            }
        }

        sum += num; // Add the last number if present
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + sumOfNumbers("1abc23"));        // 24
        System.out.println("Output: " + sumOfNumbers("1abc2x30yz67"));
        System.out.println("Output: " + sumOfNumbers("abc")); // 100
        // 100
    }
}

