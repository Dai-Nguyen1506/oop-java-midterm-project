package IteratorPatterm.Iterator;

public class NumberLinkedList implements MyCollection<Integer> {
    
    private Node head;

    // Node class for linked list
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    @Override
    public MyIterator<Integer> createIterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements MyIterator<Integer> {
        private Node current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public Integer next() {
            int value = current.value;
            current = current.next;
            return value;
        }
    }
}
