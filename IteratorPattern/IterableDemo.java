import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class StudentCollection implements Iterable<Student> {
    private List<Student> students = new ArrayList<>();

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class IterableDemo {
    public static void main(String[] args) {
        StudentCollection collection = new StudentCollection();
        collection.addStudent(new Student("Alice", 20));
        collection.addStudent(new Student("Bob", 22));
        collection.addStudent(new Student("Charlie", 21));

        for (Student student : collection) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
