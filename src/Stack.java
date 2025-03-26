import org.w3c.dom.Node;
import java.util.EmptyStackException;

//pilha feita para armazenar os pixels
public class Stack<E> {
    private No<E> top;
    private int size;

public Stack() {
    this.size = 0;
    this.top = null;
}
    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.element;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size(){
        return size;
    }

    public E pop(){
        E data = peek();

        top = top.next;
        size --;
        return data;
    }

    public void push(E element) {
        No<E> no = new No<>(element);
        no.next = top;
        top = no;
        size++;
    }

}
