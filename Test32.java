import java.util.*;

public class Test32 {
  public static void main(String[] args){

      HashMap<Integer,String> store = new HashMap<>();

      store.put(1,"Allen");
      store.put(2,"Joan");
      store.put(3,"Harrish");

      for(int i : store.keySet()) {

          System.out.println("Roll No : " + i + " " +  "Name : " + store.get(i));


      }

  }

}
