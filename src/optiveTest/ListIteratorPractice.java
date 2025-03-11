package optiveTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ListIterator<String> iterator = list.listIterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.next();
            iterator.previous();
        }
    }
}
