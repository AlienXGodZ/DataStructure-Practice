import java.util.*;

class Student123 implements Comparable<Student123> {

    int id;
    String name;
    int marks;

    Student123(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student123 other) {
        return this.id - other.id;   // Sort by Student ID
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                " | Student Name: " + name +
                " | Student Marks: " + marks;
    }
}

class StudentManagementSystem {

    ArrayList<Student123> store = new ArrayList<>();

    void add(Student123 s) {
        store.add(s);
    }

    void display() {

        System.out.println("\nStudent List:");

        for (Student123 s : store) {
            System.out.println(s);
        }
    }

    void search(int id) {

        for (Student123 s : store) {

            if (s.id == id) {
                System.out.println("\nStudent Found:");
                System.out.println(s);
                return;
            }
        }

        System.out.println("\nStudent Not Found");
    }

    void updateName(int id, String name) {

        for (Student123 s : store) {

            if (s.id == id) {

                s.name = name;
                System.out.println("\nStudent Name Updated");
                return;
            }
        }

        System.out.println("\nStudent Not Found");
    }

    void updateMarks(int id, int marks) {

        for (Student123 s : store) {

            if (s.id == id) {

                s.marks = marks;
                System.out.println("\nStudent Marks Updated");
                return;
            }
        }

        System.out.println("\nStudent Not Found");
    }

    void remove(int id) {

        Iterator<Student123> it = store.iterator();

        while (it.hasNext()) {

            Student123 s = it.next();

            if (s.id == id) {

                it.remove();
                System.out.println("\nStudent Removed");
                return;
            }
        }

        System.out.println("\nStudent Not Found");
    }

    void countStudents() {

        System.out.println("\nTotal Students: " + store.size());
    }

    void studentExists(int id) {

        for (Student123 s : store) {

            if (s.id == id) {

                System.out.println("\nStudent Exists");
                return;
            }
        }

        System.out.println("\nStudent Does Not Exist");
    }

    void sortStudents() {

        Collections.sort(store);

        System.out.println("\nStudents Sorted By ID:");

        for (Student123 s : store) {
            System.out.println(s);
        }
    }
}

public class Test115 {

    public static void main(String[] args) {

        StudentManagementSystem s = new StudentManagementSystem();

        s.add(new Student123(103, "Harvey", 80));
        s.add(new Student123(101, "Allen", 95));
        s.add(new Student123(105, "Bala", 70));
        s.add(new Student123(102, "Joan", 88));
        s.add(new Student123(104, "Harlish", 91));

        s.display();

        s.search(103);

        s.updateMarks(103, 85);

        s.updateName(105, "Bala Kumar");

        s.display();

        s.studentExists(101);

        s.remove(102);

        s.display();

        s.countStudents();

        s.sortStudents();
    }
}