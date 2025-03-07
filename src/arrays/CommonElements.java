package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8, 6, 5, 8};
        int[] arr2 = {1, 9, 8, 7, 6, 10, 11};
        CommonElements.common(arr1, arr2);
    }

    public static void common(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        Set<Integer> commonEle = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            if (set.contains(i)) {
                commonEle.add(i);
            }
        }

        System.out.println("Common Elements are : " + Arrays.toString(commonEle.toArray()));

    }
}
