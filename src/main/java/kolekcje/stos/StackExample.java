package kolekcje.stos;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        // peek zwróci literke ale jej nie usunie
        System.out.println(stack.peek());
        // pop zwróci literke i ją usunie
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
