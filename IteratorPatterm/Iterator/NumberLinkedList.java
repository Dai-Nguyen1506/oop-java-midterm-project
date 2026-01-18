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

    @Override
    public MyIterator<Integer> createIterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements MyIterator<Integer> {
        private Node current;
        private boolean iterationStarted = false;
        
        @Override
        public boolean hasNext() {
            // Initialize current on first call to hasNext()
            if (!iterationStarted) {
                current = head;
                iterationStarted = true;
            }
            return current != null;
        }

        @Override
        public Integer next() {
            int value = current.value;
            current = current.next;
            return value;
        }

        @Override
        public void add(Integer value) {
            // Case 1: Empty list
            if (head == null) {
                head = new Node(value);
                return;
            }

            // Case 2: Add to end of list
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }
}
