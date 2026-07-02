import java.util.*;

 class Student implements Comparable<Student> {

     String SubjectName;
     int Mark;

     Student(String SubjectName, int Mark) {

         this.SubjectName = SubjectName;
         this.Mark = Mark;
     }

     public int compareTo(Student others) {
         return this.Mark - others.Mark;
     }


     public String toString() {
         return SubjectName + " : " + Mark;
     }

 }

    public class Test73{
        public static void main(String[] args){

           ArrayList<Student> store = new ArrayList<>();

           store.add(new Student("Maths",98));
           store.add(new Student("Science", 99));
           store.add(new Student("Social", 90));
           store.add(new Student("Physics" , 100));

           Collections.sort(store);
           System.out.println(store);


        }





    }

