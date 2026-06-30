import java.util.*;

public class Test48 {
    public static void main(String[] args){

        LinkedHashMap<Integer,String> store = new LinkedHashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(4,"Harrish");
        store.put(3,"Harvey");

        for(int i : store.keySet()){
            System.out.println(i);
        }

        for(String i : store.values()){
            System.out.println(i);
        }

        for(Map.Entry<Integer,String> ultrastore : store.entrySet()){
            System.out.println(ultrastore.getKey() + " : " + ultrastore.getValue());
        }

        Iterator<Map.Entry<Integer,String>> ultrastore1 = store.entrySet().iterator();

         while(ultrastore1.hasNext()){
             Map.Entry<Integer,String> move = ultrastore1.next();
             System.out.println(move.getKey() + " " + move.getValue());

         }

    }
}
