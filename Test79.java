import java.util.*;

 class Students {
     String name;
     int mark;

     Students(String name, int mark) {
         this.name = name;
         this.mark = mark;
     }

     public String toString() {
         return name ;
     }

     public String full(){
         return name + " : " + mark;
     }
 }

     class AscendingOrder implements Comparator<Students> {

         public int compare(Students s1, Students s2) {
             return s1.name.compareTo(s2.name);
         }

     }

     class DescendingOrder implements Comparator<Students>{

       public int compare(Students s1, Students s2){
             return s2.name.compareTo(s1.name);
       }
     }

public class Test79 {
    public static void main(String[] args) {

        ArrayList<Students> store = new ArrayList<>();

        store.add(new Students("Allen", 50));
        store.add(new Students("Joan", 70));
        store.add(new Students("Harrish", 80));
        store.add(new Students("Harvey", 90));

        Collections.sort(store, new AscendingOrder());

        System.out.println(store);

        Collections.sort(store, new DescendingOrder());


        for (Students i : store) {
            System.out.print(i.full() + " ");

        }

    }
}

