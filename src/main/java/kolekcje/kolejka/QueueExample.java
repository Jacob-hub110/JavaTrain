package kolekcje.kolejka;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExample {

    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }

}
