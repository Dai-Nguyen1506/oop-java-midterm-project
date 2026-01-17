package IteratorPatterm.Iterator;

// Generic collection interface
public interface MyCollection<T> {

    // Method to create an iterator for the collection
    MyIterator<T> createIterator();
}
