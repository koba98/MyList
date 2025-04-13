public class MyStack<T extends Comparable<T>> {
    private MyList<T> list;
    public MyStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T element) {
        list.addLast(element);
    }
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = list.getLast();
        list.removeLast();
        return element;
    }
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getLast();
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
}
