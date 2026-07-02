import java.util.*;

 class Books implements Comparable<Books>{

     String name;
     String title;

     Books(String name, String title){
         this.name = name;
         this.title = title;
     }

     public int compareTo(Books others){
         return this.title.compareTo(others.title);
     }

     public String toString() {

         return name + " : " + title;
     }

 }
public class Test77 {
    public static void main(String[] args){

        ArrayList<Books> store = new ArrayList<>();

        store.add(new Books("The Chair","Chapter1"));
        store.add(new Books("The Ghost","Chapter 2"));
        store.add(new Books("The bleach","Chapter 3"));

        Collections.sort(store);

        System.out.println(store);



    }
}
