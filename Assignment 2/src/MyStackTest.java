public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack: " + java.util.Arrays.toString(stack.toArray()));

        System.out.println("Peek: " + stack.peek());

        System.out.println("pop: " + stack.pop());
        System.out.println("After pop: " + java.util.Arrays.toString(stack.toArray()));

        System.out.println("Size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());

        stack.clear();
        System.out.println("After clear: " + stack.size());

    }
}
