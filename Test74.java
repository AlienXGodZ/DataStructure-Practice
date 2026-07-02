import java.util.*;

 class Student1 implements Comparable<Student1> {

    String SubjectName;
    int Mark;

    Student1(String SubjectName, int Mark) {

        this.SubjectName = SubjectName;
        this.Mark = Mark;
    }

    public int compareTo(Student1 others) {
        return this.SubjectName.compareTo(others.SubjectName);
    }


    public String toString() {
        return SubjectName + " : " + Mark;
    }

}

public class Test74{
    public static void main(String[] args){

        ArrayList<Student1> store = new ArrayList<>();

        store.add(new Student1("Maths",98));
        store.add(new Student1("Science", 99));
        store.add(new Student1("Social", 90));
        store.add(new Student1("Physics" , 100));

        Collections.sort(store);
        System.out.println(store);


    }





}

