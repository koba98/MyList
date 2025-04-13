# Java Custom Data Structures

This project is a Java implementation of custom data structures based on the `MyList<T>` interface. It includes physical data structures like `MyArrayList` and `MyLinkedList`, and logical data structures like `MyStack`, `MyQueue`, and `MyMinHeap`.

---

## ✅ Features

- `MyArrayList<T>`: Custom dynamic array implementation
- `MyLinkedList<T>`: Doubly linked list implementation
- `MyStack<T>`: Stack based on `MyArrayList`
- `MyQueue<T>`: Queue based on `MyLinkedList`
- `MyMinHeap<T>`: Min-heap based on `MyArrayList`

Each class implements or uses the generic `MyList<T>` interface and only uses `java.util.Iterator` — **no `java.util.*` collections used!**

---

## 📂 Project Structure

```
src/
├── MyList.java          // Interface
├── MyArrayList.java     // Array list implementation
├── MyLinkedList.java    // Doubly linked list implementation
├── MyStack.java         // Stack based on MyArrayList
├── MyQueue.java         // Queue based on MyLinkedList
├── MyMinHeap.java       // MinHeap based on MyArrayList
├── MyArrayListTest.java // Tests for MyArrayList
├── MyMinHeapTest.java   // Tests for MyMinHeap
```

---

## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-data-structures.git
   cd java-data-structures
   ```

2. Compile the project:
   ```bash
   javac *.java
   ```

3. Run a test file (example):
   ```bash
   java MyMinHeapTest
   ```

---

## 🧪 Example Test (MyMinHeapTest.java)

```java
public class MyMinHeapTest {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(4);
        heap.insert(2);
        heap.insert(9);
        heap.insert(1);
        heap.insert(7);

        while (heap.size() > 0) {
            System.out.println(heap.extractMin());
        }
    }
}
```

Expected output:
```
1
2
4
7
9
```

---

## 💡 Sorting and Comparisons

Generic types are restricted to `T extends Comparable<T>` for sorting functionality.

You can also modify `sort()` to accept a custom comparator if needed.

---

## 🔁 Iterator Support

All data structures implement the `Iterable<T>` interface, so you can use `for-each` loops:

```java
for (Integer i : myArrayList) {
    System.out.prin
