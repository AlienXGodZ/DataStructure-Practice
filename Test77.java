import java.util.*;

 class Books implements Comparable<cars>{

     String name;
     String title;

     Books(String name, String title){
         this.name = name;
         this.title = title;
     }

     public int compareTo(cars others){
         return this.title.compareTo(others.model);
     }

     public String toString() {

         return name + " : " + title;
     }

 }
public class Test77 {
    public static void main(String[] args){

        ArrayList<cars> store = new ArrayList<>();

        store.add(new cars("The Chair","Chapter1"));
        store.add(new cars("The Ghost","Chapter 2"));
        store.add(new cars("The bleach","Chapter 3"));

        Collections.sort(store);

        System.out.println(store);



    }
}
