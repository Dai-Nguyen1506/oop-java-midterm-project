package Iterator.MyIterators;
import Iterator.Iterator;
import Iterator.MyObjects.Node;
import Iterator.MyCollections.LinkedList;


public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;
    private Node<T> previous;
    private Node<T> lastReturned;
    private LinkedList<T> list;

    public LinkedListIterator(Node<T> head, LinkedList<T> list) {
        this.current = head;
        this.previous = null;
        this.lastReturned = null;
        this.list = list;
    }

    public boolean hasNext() {
        return current != null;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public T next() {
        if (!hasNext()) return null;
        
        lastReturned = current;
        T data = current.getData();
        
        previous = lastReturned.getPrevious();
        current = current.getNext();
        
        return data;
    }

    public T previous() {
        if (!hasPrevious()) return null;
        
        lastReturned = previous;
        T data = lastReturned.getData();
        
        current = lastReturned.getNext();
        previous = lastReturned.getPrevious();
        
        return data;
    }

    public void remove() {
        if (lastReturned == null) {
            throw new IllegalStateException("No element to remove. Call next() or previous() first.");
        }

        // Use LinkedList's removeNode method to handle head node case
        list.removeNode(lastReturned);

        // Update iterator's state
        if (current == lastReturned) {
            current = lastReturned.getNext();
        } else {
            previous = lastReturned.getPrevious();
        }

        lastReturned = null;
    }
}
