package IteratorPatterm.Iterator;

// Main class to demonstrate the Iterator Pattern
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        MyCollection<Integer> collection = new NumberArray(arr);
        MyIterator<Integer> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using NumberLinkedList:");
        NumberLinkedList list = new NumberLinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        MyIterator<Integer> listIterator = list.createIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}