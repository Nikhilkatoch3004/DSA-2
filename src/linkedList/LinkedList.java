package linkedList;

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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(20);
        ll.insert(20);

        ll.reverse();

        ll.size();
//        ll.deleteEnd();
//       ll.deleteBegin();
        ll.display();

    }

}

