package sorting;

//In selection sort we use 2 loops and consider every element as minimum
public class SelectionSort {

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 9, 7, 3};
        SelectionSort.selection(arr);
    }
}
