package iterator__iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

// Laptop class implementing Iterable<Laptop>
class Laptop implements Iterable<Laptop> {
    String name;
    double price;
    int ram;

    // List to store multiple Laptop objects
    private List<Laptop> laptops = new ArrayList<>();

    public Laptop(String name, double price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    // Adding a laptop to the list
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    // Overriding iterator() to return an Iterator for the laptops list
    @Override
    public Iterator<Laptop> iterator() {
        return laptops.iterator();
    }

    // Overriding forEach (optional, inherits default behavior)
    @Override
    public void forEach(Consumer<? super Laptop> action) {
        laptops.forEach(action);
    }

    // Overriding spliterator (optional, inherits default behavior)
    @Override
    public Spliterator<Laptop> spliterator() {
        return laptops.spliterator();
    }

    // To display laptop details
    @Override
    public String toString() {
        return "Laptop{name='" + name + "', price=" + price + ", RAM=" + ram + "GB}";
    }
}

// Main class
public class IterableExample {
    public static void main(String[] args) {
        // Creating a Laptop collection
        Laptop collection = new Laptop("Collection", 0, 0);

        // Adding individual laptop objects
        collection.addLaptop(new Laptop("Dell XPS", 1200.99, 16));
        collection.addLaptop(new Laptop("MacBook Pro", 2500.50, 32));
        collection.addLaptop(new Laptop("HP Spectre", 1800.75, 16));

        // Iterating using for-each loop (because Laptop implements Iterable)
        System.out.println("Laptops in Collection:");
        for (Laptop laptop : collection) {
            System.out.println(laptop);
        }

        System.out.println();

        //Iterating using Iterator
        Iterator<Laptop> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " --> ");
        }
    }
}
