package Iterator.MyCollections;
import Iterator.Iterator;
import Iterator.MyIterators.BookIterator;
import Iterator.MyObjects.BookInfo;


public class BookCollection<T> implements Collection<T> {
    private BookInfo[] books;
    private int size;

    public BookCollection(int capacity) {
        books = new BookInfo[capacity];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size < books.length) {
            books[size++] = (BookInfo) item;
        } else {
            System.out.println("Collection is full. Cannot add more items.");
        }
    }

    @Override
    public Iterator<T> createIterator() {
        return new BookIterator<>(this);
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        if (i >= 0 && i < size) {
            return (T) books[i];
        }
        throw new IndexOutOfBoundsException("Index out of bounds: " + i);
    }
}
