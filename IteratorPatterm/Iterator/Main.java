package IteratorPatterm.Iterator;

// Main class to demonstrate the Iterator Pattern
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println("Using NumberArray:");
        MyCollection<Integer> collection = new NumberArray(arr);
        MyIterator<Integer> iterator = collection.createIterator();
        iterator.add(40);
        iterator.add(50);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using NumberLinkedList:");
        MyCollection<Integer> list = new NumberLinkedList();
        MyIterator<Integer> listIterator = list.createIterator();
        listIterator.add(100);
        listIterator.add(200);
        listIterator.add(300);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}