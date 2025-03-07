package searching;

public class BinarySearch {

    public static boolean binarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                return true;
            }

            if (arr[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 8, 9, 14};
        int n = 1;
        if (binarySearch(arr, n)) {
            System.out.println("Number present");
        } else {
            System.out.println("Number not Present");
        }
    }
}
