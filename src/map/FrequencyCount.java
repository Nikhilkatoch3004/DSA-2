package map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {

        Map<Integer, Integer> freq = new HashMap<>();

        int[] arr = {1, 2, 4, 4, 6, 7, 1, 6};

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        System.out.println(freq);
    }


}

