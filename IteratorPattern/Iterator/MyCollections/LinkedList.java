package Iterator.MyCollections;
import Iterator.Iterator;
import Iterator.MyObjects.Node;
import Iterator.MyIterators.LinkedListIterator;


public class LinkedList<T> implements Collection<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            newNode.setPrevious(current);
            current.setNext(newNode);
        }
    }

    public void removeNode(Node<T> node) {
        if (node == null) return;

        Node<T> prevNode = node.getPrevious();
        Node<T> nextNode = node.getNext();

        // If removing head node
        if (node == head) {
            head = nextNode;
            if (head != null) {
                head.setPrevious(null);
            }
        } else {
            // Not head node
            if (prevNode != null) {
                prevNode.setNext(nextNode);
            }
            if (nextNode != null) {
                nextNode.setPrevious(prevNode);
            }
        }
    }

    public Iterator<T> createIterator() {
        return new LinkedListIterator<>(head, this);
    }
}
