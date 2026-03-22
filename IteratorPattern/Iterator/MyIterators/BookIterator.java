package Iterator.MyIterators;

import java.util.List;

import Iterator.Iterator;
import Iterator.MyObjects.BookInfo;

public class BookIterator implements Iterator<BookInfo> {
    
    private List<BookInfo> books;
    private int currentIndex;

    public BookIterator(List<BookInfo> books) {
        this.books = books;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public BookInfo next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more elements");
        }
        return books.get(currentIndex++);
    }
}
