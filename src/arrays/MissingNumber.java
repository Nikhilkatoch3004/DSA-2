package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 5, 6, 7, 9, 10};
        MissingNumber.missing(arr);
    }

    public static void missing(int[] arr) {

        int n = arr.length;
        int total = (n + 1) * ((n + 1) + 1) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Missing Number is : " + (total - sum));
    }
}
