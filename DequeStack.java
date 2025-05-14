import java.util.*;

public class DequeStack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("Top after pop: " + stack.peek());
    }
}
