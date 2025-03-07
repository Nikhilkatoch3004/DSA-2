package arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 52, 565, 4, 3, 1};
        LargestAndSmallest.largest_smallest(arr);
    }

    public static void largest_smallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            //largest
            if (arr[i] >= largest) largest = arr[i];

            //smallest
            if (arr[i] <= smallest) smallest = arr[i];
        }

        System.out.println("Largest Number is : " + largest + "\nSmallest Number is : " + smallest);
    }
}
