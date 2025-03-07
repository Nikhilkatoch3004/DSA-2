package objectsCompare;

import java.util.Comparator;

public class Test2 {

    public static void main(String[] args) {

        Comparator<Laptop> comp = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }
                return -1;
            }
        };
    }
}
