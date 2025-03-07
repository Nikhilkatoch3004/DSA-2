package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    static List<Integer> ll = new LinkedList<>();

    public static void insertAtPosition(int data, int n) {
        if (n < ll.size() && n >= 0) {
            ll.add(n, data);
            display(ll);
        } else {
            throw new IllegalArgumentException("Position not present in Linked List");

        }
    }

    public static void reverseLinkedList() {

        int left = 0, right = ll.size() - 1;
        while (left < right) {
            int temp = ll.get(left);
            ll.set(left, ll.get(right));
            ll.set(right, temp);
            left++;
            right--;
        }
        display(ll);
    }

    public static void display(List<Integer> linked) {
        for (int i : linked) {
            System.out.print(i + "-->");
        }
    }

    public static void main(String[] args) {


        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        LinkedListCollection.insertAtPosition(85, 4);
        System.out.println("/n");
        LinkedListCollection.reverseLinkedList();

    }
}
