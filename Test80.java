import java.util.*;

  class students {
      int mark;
      String name;

      students(int mark, String name) {
          this.mark = mark;
          this.name = name;
      }

      public String toString() {
          return name + " : " + mark;
      }
  }

    class mark implements Comparator<students> {

       public int compare(students s1, students s2) {
           if (s1.mark != s2.mark) {
               return s1.mark - s2.mark;
           } else {
               return s1.name.compareTo(s2.name);
           }
       }
   }



public class Test80 {
    public static void main(String[] args){

         ArrayList<students> store = new ArrayList<>();

         store.add(new students(80,"Allen"));
        store.add(new students(90,"Joan"));
        store.add(new students(80,"Harvey"));
        store.add(new students(70,"Harrish"));
        store.add(new students(90,"Bala"));

        Collections.sort(store,new mark());

        System.out.println(store);

    }
}
