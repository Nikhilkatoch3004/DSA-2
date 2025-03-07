package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int data) {
        queue1.add(data);
    }

    public void pop() {
        if (queue1.isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll();

        //Swap the Queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        System.out.println(topElement + " Popped Element");

    }

    public static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();

        stack.push(60);

        stack.pop();


    }

}
