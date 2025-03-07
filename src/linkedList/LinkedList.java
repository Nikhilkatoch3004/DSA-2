package linkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head;

    //Insert the New Node at End
    public Node insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return null;
    }

    //Insert New Node At Begining
    public void insertBegin(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //Delete from end
    public void deleteEnd() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List Empty");
        } else if (head.next == null) {
            head = null;
        } else {
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

    }

    public void deleteBegin() {
        if (head == null) {
            System.out.println("List Empty");
        } else if (head.next == null) {
            head = null;
        } else {
            head = head.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node forward = null;

        if (head == null) {
            System.out.println("List Empty");
        } else if (head.next == null) {
            System.out.println("Only 1 element Present");
        } else {
            while (current != null) {
                forward = current.next;
                current.next = prev;
                prev = current;
                current = forward;
            }
            head = prev;
        }
    }

    public void size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Sizze of Linked List : " + count);
    }

    //Middle of Linked List
    public void middle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element is : " + slow.data);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter your Choice :\n1: Insert The Element.\n2: Insert At Beginning. \n" +
                    "3: Size of LinkedList. \n4: Delete From Beginning. \n5: Delete From End. \n6: Middle of Linked List" +
                    "\n7: Display Linked List. \n8: Reverse Linked List. \n9: Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Data : ");
                    int value = sc.nextInt();
                    ll.insert(value);
                    break;
                case 2:
                    System.out.print("Enter the Data : ");
                    int value1 = sc.nextInt();
                    ll.insertBegin(value1);
                    break;
                case 3:
                    ll.size();
                    break;
                case 4:
                    ll.deleteBegin();
                    break;
                case 5:
                    ll.deleteEnd();
                    break;
                case 6:
                    ll.middle();
                    break;
                case 7:
                    ll.display();
                    break;
                case 8:
                    ll.reverse();
                    break;
                case 9:
                    check = false;
                    break;
                default:
                    System.out.println("Enter the Correct choice.");
                    break;

            }
        }

        sc.close();

    }

}

