package iterator__iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Aditya");
        names.add("Nikhil");
        names.add("Saumya");
        names.add("Tanisha");
        names.add("Narayan");

        Iterator<String> iterator = names.iterator();

        //hasNext() and next() methods
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "-->");
        }

        System.out.println();

        iterator = names.iterator();

        //remove() method of Iterater
        while (iterator.hasNext()) {
            if (iterator.next().equals("Tanisha")) {
                iterator.remove();
            }
        }

        System.out.println("Updated List : " + names);
    }
}
