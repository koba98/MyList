public class MyQueue<T extends Comparable<T>> {
    private MyList<T> list;

    public MyQueue() {
        this.list = new MyLinkedList<>();
    }

    public void enqueue(T element){
        list.addLast(element);
    }

    public T dequeue(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        T element = list.getFirst();
        list.removeFirst();
        return element;
    }
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
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
