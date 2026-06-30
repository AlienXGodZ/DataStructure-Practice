import java.util.*;

public class Test42 {
    public static void main(String[] args){

        TreeMap<Integer,String> store = new TreeMap<>();

        store.put(2,"Allen");
        store.put(1,"Joan");
        store.put(3,"Edwin");
        store.put(4,"Harvey");


        for(int i : store.keySet()){
            System.out.println(i + " " + store.get(i));
        }



    }

}
