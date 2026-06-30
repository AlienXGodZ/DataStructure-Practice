import java.util.*;


public class Test45 {
    public static void main(String[] args){

        TreeMap<Integer,String> store = new TreeMap<>();

        store.put(2,"Allen");
        store.put(1,"Joan");
        store.put(3,"Edwin");
        store.put(4,"Harvey");


      Iterator<Map.Entry<Integer,String>> it = store.entrySet().iterator();

      while(it.hasNext()){
          Map.Entry<Integer,String> entry = it.next();

          System.out.println(entry.getKey() + " : " + entry.getValue());

      }



    }

}




