public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap() {
        this.list = new MyArrayList<>();
    }

    public void insert(T element) {
        list.addLast(element);
        heapifyUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        T min = list.get(0);
        T last = list.get(list.size() - 1);
        list.set(0, last);
        list.removeLast();

        heapifyDown(0);

        return min;
    }

    public T getMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            T current = list.get(index);
            T parentValue = list.get(parent);

            if (current.compareTo(parentValue) < 0) {
                // swap
                list.set(index, parentValue);
                list.set(parent, current);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int size = list.size();

        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && list.get(left).compareTo(list.get(smallest)) < 0) {
                smallest = left;
            }
            if (right < size && list.get(right).compareTo(list.get(smallest)) < 0) {
                smallest = right;
            }

            if (smallest != index) {
                T temp = list.get(index);
                list.set(index, list.get(smallest));
                list.set(smallest, temp);
                index = smallest;
            } else {
                break;
            }
        }
    }
}
