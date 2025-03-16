package searching;

public class BinarySearch2 {

    public static boolean search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {20, 40, 60, 70, 80};
        System.out.println("Element Found : " + BinarySearch2.search(arr, 90));
    }
}
