import java.util.EmptyStackException;

public class Queue<E> {
    private No<E> front; 
    private No<E> rear;  
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(E element) {
        No<E> no = new No<>(element);
        if (isEmpty()) {
            front = rear = no;
        } else {
            rear.next = no;  
            rear = no;       
        size++;
        }
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return front.element;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E data = front.element;
        front = front.next;
        size--;

        if (front == null) { 
            rear = null;
        }
        return data;
    }
}
