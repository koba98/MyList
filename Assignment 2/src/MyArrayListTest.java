public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();

        System.out.println("=== Testing add and get ===");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Expected: 10, Actual: " + list.get(0));
        System.out.println("Expected: 30, Actual: " + list.get(2));

        System.out.println("\n=== Testing addFirst and addLast ===");
        list.addFirst(5);
        list.addLast(40);
        printList(list); // Expected: 5 10 20 30 40

        System.out.println("\n=== Testing remove ===");
        list.remove(2); // remove 20
        printList(list); // Expected: 5 10 30 40

        System.out.println("\n=== Testing set ===");
        list.set(1, 99);
        printList(list); // Expected: 5 99 30 40

        System.out.println("\n=== Testing indexOf and lastIndexOf ===");
        list.add(99);
        System.out.println("indexOf 99: " + list.indexOf(99)); // 1
        System.out.println("lastIndexOf 99: " + list.lastIndexOf(99)); // 4

        System.out.println("\n=== Testing exists ===");
        System.out.println("Exists 30? " + list.exists(30)); // true
        System.out.println("Exists 100? " + list.exists(100)); // false

        System.out.println("\n=== Testing getFirst and getLast ===");
        System.out.println("First: " + list.getFirst()); // 5
        System.out.println("Last: " + list.getLast());   // 99

        System.out.println("\n=== Testing sort ===");
        list.sort();
        printList(list); // Expected: sorted list

        System.out.println("\n=== Testing toArray ===");
        Object[] arr = list.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }

        System.out.println("\n\n=== Testing clear ===");
        list.clear();
        System.out.println("Size after clear: " + list.size()); // 0
    }

    private static void printList(MyList<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
