package Iterator.MyIterators;
import Iterator.Iterator;
import Iterator.MyObjects.Node;

public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;

    public LinkedListIterator(Node<T> head) {
        this.current = head;
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        if (!hasNext())
            throw new IllegalStateException("No more elements in the collection.");

        T data = current.getData();
        current = current.getNext();
        
        return data;
    }
}
