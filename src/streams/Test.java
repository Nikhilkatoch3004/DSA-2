package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Elements in List : " + list.stream()
                .count());

        List<Integer> arr = list.stream()
                .filter(n -> n >= 30)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(arr);

        System.out.println(list.stream());

    }


}
