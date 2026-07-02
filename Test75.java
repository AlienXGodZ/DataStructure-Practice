import java.util.*;

  class employe implements Comparable<employe>{

      int salary;

      employe(int salary){
          this.salary = salary;
      }

      public int compareTo(employe other){
          return Integer.compare(this.salary, other.salary);
      }

      public String toString() {

          return String.valueOf(salary);
      }
  }


public class Test75 {
    public static void main(String[] args){

        ArrayList<employe> store = new ArrayList<>();

        store.add(new employe(20000));
        store.add(new employe(15000));
        store.add(new employe(10000));
        store.add(new employe(25000));

        Collections.sort(store);

        System.out.println(store);


    }
}
