import Iterator.Iterator;
import Iterator.MyCollections.*;
import Iterator.MyObjects.*;

// Main Class for Iterator Pattern
public class IteratorPatternDemo {
    public static void main(String[] args) {
        // Create a collection LinkedList and add some items
        LinkedList<String> collection = new LinkedList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Java");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        // Create a collection BookCollection and add some items
        BookCollection bookCollection = new BookCollection();
        bookCollection.add(new BookInfo("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookCollection.add(new BookInfo("To Kill a Mockingbird", "Harper Lee", 1960));
        bookCollection.add(new BookInfo("1984", "George Orwell", 1949));

        Iterator<BookInfo> bookIterator = bookCollection.iterator();
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        // for (BookInfo book : bookCollection) {
        //     System.out.println(book);
        // }
    }
}
