// No Iterator Pattern - Direct access to collection internal structure

// Book Info class
class BookInfoNoIterator {
    private String title;
    private String author;
    private int year;

    public BookInfoNoIterator(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }
}

// Simple Array-based Collection without Iterator
class BookListNoIterator {
    private BookInfoNoIterator[] books;
    private int size;
    private int capacity;

    public BookListNoIterator(int capacity) {
        this.capacity = capacity;
        this.books = new BookInfoNoIterator[capacity];
        this.size = 0;
    }

    public void add(BookInfoNoIterator book) {
        if (size < capacity) {
            books[size++] = book;
        }
    }

    // Client must know internal structure (array with size)
    public BookInfoNoIterator[] getBooks() {
        return books;
    }

    public int getSize() {
        return size;
    }
}

// Simple Node-based collection without Iterator
class NodeNoIterator<T> {
    private T data;
    private NodeNoIterator<T> next;

    public NodeNoIterator(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() { return data; }
    public NodeNoIterator<T> getNext() { return next; }
    public void setNext(NodeNoIterator<T> next) { this.next = next; }
}

class LinkedListNoIterator {
    private NodeNoIterator<String> head;

    public LinkedListNoIterator() {
        this.head = null;
    }

    public void add(String data) {
        NodeNoIterator<String> newNode = new NodeNoIterator<>(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeNoIterator<String> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Client must know internal structure (linked list with nodes)
    public NodeNoIterator<String> getHead() {
        return head;
    }
}

// Driver Code - Shows the problem without Iterator Pattern
public class NoIteratorPattern {
    public static void main(String[] args) {
        System.out.println("=== Without Iterator Pattern ===\n");

        // Example 1: Array-based collection
        System.out.println("1. Traversing Array-based collection:");
        BookListNoIterator bookList = new BookListNoIterator(5);
        bookList.add(new BookInfoNoIterator("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookList.add(new BookInfoNoIterator("To Kill a Mockingbird", "Harper Lee", 1960));
        bookList.add(new BookInfoNoIterator("1984", "George Orwell", 1949));

        // Problem: Client must know internal structure and use index-based access
        BookInfoNoIterator[] books = bookList.getBooks();
        int size = bookList.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }

        System.out.println("\n2. Traversing Linked List:");
        LinkedListNoIterator linkedList = new LinkedListNoIterator();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");

        // Problem: Client must know internal structure and use node-based traversal
        NodeNoIterator<String> current = linkedList.getHead();
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
