public class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();

        System.out.println("---Testing MyLinkedList---");
        System.out.println(" ");

        list.add(10);//add some values
        list.add(20);
        list.add(30);
        System.out.println("list: " + java.util.Arrays.toString(list.toArray()));


        list.addFirst(5);
        list.addLast(40);
        System.out.println("addFirst & addLast:" + java.util.Arrays.toString(list.toArray()));

        list.add(2, 15);
        System.out.println("addIndex" + java.util.Arrays.toString(list.toArray()));

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.set(3, 25); // Test set
        System.out.println("After set(3, 25): " + java.util.Arrays.toString(list.toArray()));

        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Last index of 10: " + list.lastIndexOf(10));

        System.out.println("Exists 25? " + list.exists(25));//test exist

        list.add(1);
        list.add(100);
        list.sort();
        System.out.println("After sort: " + java.util.Arrays.toString(list.toArray()));//test sort

        list.remove(2);
        System.out.println("After remove(2): " + java.util.Arrays.toString(list.toArray()));

        System.out.println("Size: " + list.size());// test size

        list.clear();
        System.out.println("After clear, size: " + list.size()); // Test clear
    }
}
