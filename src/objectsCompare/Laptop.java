package objectsCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Laptop implements Comparable<Laptop> {
//public class Laptop {


    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop object) {
        if (this.ram == object.ram) {
            return 0; // ✅ Correct: Returns 0 if both RAM values are equal
        }
        return this.ram > object.ram ? 1 : -1; // ✅ Correct: Returns 1 if greater, -1 if smaller
    }

}

class test {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Lenovo", 8, 85000);
        Laptop l2 = new Laptop("Hp", 4, 55000);
        Laptop l3 = new Laptop("Asus", 16, 65000);

        List<Laptop> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

        for (Laptop laptop : list) {
            System.out.println(laptop);
        }
        System.out.println("\n");
        Collections.sort(list);

        for (Laptop laptop : list) {
            System.out.println(laptop);
        }


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
        Collections.sort(list, comp);

        System.out.println("\n");

        for (Laptop laptop : list) {
            System.out.println(laptop);
        }
    }
}