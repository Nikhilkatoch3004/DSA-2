package streams;

import java.util.*;
import java.util.stream.IntStream;

public class Marks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);

        System.out.println(marks.toString());

        List<Integer> updatedMarks = marks.stream()
                .map(i -> i + 10)
                .toList();

        System.out.println(updatedMarks.toString());

        updatedMarks.forEach(i -> System.out.print(i + "-->"));

        System.out.println();
        int[] arr = {2, 5, 7, 8, 9, 0};
        System.out.println("Printing array using forEach() :");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream narr = Arrays.stream(arr).distinct();
        System.out.println(Arrays.toString(narr.toArray()));

        Optional<Integer> n = updatedMarks.stream().findFirst().map(i -> 50);
        System.out.println("Find First : " + n.get());

        Optional<Integer> maximun = updatedMarks.stream().max(Comparator.naturalOrder());
        System.out.println("Maximum ELement is : " + maximun.get());
    }
}
