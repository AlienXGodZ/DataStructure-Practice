import java.util.*;

 class Books implements Comparable<Reverse>{

     String name;
     String title;

     Books(String name, String title){
         this.name = name;
         this.title = title;
     }

     public int compareTo(Reverse others){
         return this.title.compareTo(others.model);
     }

     public String toString() {

         return name + " : " + title;
     }

 }
public class Test77 {
    public static void main(String[] args){

        ArrayList<Reverse> store = new ArrayList<>();

        store.add(new Reverse("The Chair","Chapter1"));
        store.add(new Reverse("The Ghost","Chapter 2"));
        store.add(new Reverse("The bleach","Chapter 3"));

        Collections.sort(store);

        System.out.println(store);



    }
}
