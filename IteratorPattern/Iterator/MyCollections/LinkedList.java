package Iterator.MyCollections;
import Iterator.Iterator;
import Iterator.MyObjects.Node;
import Iterator.MyIterators.LinkedListIterator;


public class LinkedList<T> implements Collection<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
}
