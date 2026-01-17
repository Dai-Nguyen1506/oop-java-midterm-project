package IteratorPatterm.Iterator;

// Generic iterator interface
public interface MyIterator<T> {

    // Check if there are more elements to iterate over
    boolean hasNext();
    T next();
}