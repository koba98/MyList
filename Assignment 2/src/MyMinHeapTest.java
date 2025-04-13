public class MyMinHeapTest {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        System.out.println("Heap as array: " + java.util.Arrays.toString(heap.toArray()));
        System.out.println("Min " + heap.getMin());

        System.out.println("Extract min: " + heap.extractMin());
        System.out.println("After extract: " + java.util.Arrays.toString(heap.toArray()));

        heap.insert(2);
        System.out.println("After insert(2): " + java.util.Arrays.toString(heap.toArray()));

    }
}
