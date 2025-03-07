package sorting;

public class BubbleSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = {20, 40, 10, 35, 20, 22, 15};
        bubbleSort.sort(arr);

        System.out.print("Sorted Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? "-->" : " "));
        }
    }
}
