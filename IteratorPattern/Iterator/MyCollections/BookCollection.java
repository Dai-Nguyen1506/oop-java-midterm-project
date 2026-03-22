package Iterator.MyCollections;
import Iterator.Iterator;
import Iterator.MyIterators.BookIterator;
import Iterator.MyObjects.BookInfo;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Collection<BookInfo> {
    private List<BookInfo> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    @Override
    public Iterator<BookInfo> iterator() {
        return new BookIterator(books);
    }

    public void add(BookInfo item) {
        books.add(item);
    }


    public int size() {
        return books.size();
    }

    public BookInfo get(int i) {
        if (i >= 0 && i < size()) {
            return books.get(i);
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + i);
    }
}
