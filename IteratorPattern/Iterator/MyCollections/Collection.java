package Iterator.MyCollections;
import Iterator.Iterator;

public interface Collection<T> {
    void add(T data);
    Iterator<T> createIterator();
}
