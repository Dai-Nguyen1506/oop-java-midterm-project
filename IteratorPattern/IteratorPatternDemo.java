import Iterator.Iterator;
import Iterator.MyCollections.*;
import Iterator.MyObjects.*;

// Main Class for Iterator Pattern
public class IteratorPatternDemo {
    public static void main(String[] args) {
        LinkedList<String> collection = new LinkedList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Java");

        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        System.out.println("After deletion:");
        Iterator<String> iterator_1 = collection.createIterator();
        while (iterator_1.hasNext()) {
            System.out.println(iterator_1.next());
        }

        BookCollection<BookInfo> bookCollection = new BookCollection<>(5);
        bookCollection.add(new BookInfo("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookCollection.add(new BookInfo("To Kill a Mockingbird", "Harper Lee", 1960));
        bookCollection.add(new BookInfo("1984", "George Orwell", 1949));

        Iterator<BookInfo> bookIterator = bookCollection.createIterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }
    }
}
