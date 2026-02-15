package Iterator.MyIterators;

import Iterator.Iterator;
import Iterator.MyCollections.BookCollection;

public class BookIterator<T> implements Iterator<T> {
    
    private BookCollection<T> collection;
    private int currentIndex;

    public BookIterator(BookCollection<T> collection) {
        this.collection = collection;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return collection.get(currentIndex++);
        }
        return null; // or throw an exception
    }
}
