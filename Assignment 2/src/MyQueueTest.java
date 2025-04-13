public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue= new MyQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue after enqueue: " + java.util.Arrays.toString(queue.toArray())); // [A, B, C]

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue()); // A
        System.out.println("After dequeue: " + java.util.Arrays.toString(queue.toArray())); // [B, C]

        System.out.println("Size: " + queue.size());

        System.out.println("Is empty?: " + queue.isEmpty());

        queue.clear();
        System.out.println("After clear: " + queue.size());

    }
}
