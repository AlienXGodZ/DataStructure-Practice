import java.util.*;

public class Test39 {
    public static void main(String[] args){

        TreeMap<Integer,String> store = new TreeMap<>();

        store.put(2,"Allen");
        store.put(1,"Joan");
        store.put(3,"Edwin");
        store.put(4,"Harvey");


        System.out.println(store.firstEntry());
        System.out.println(store.lastEntry());

        System.out.println(store.firstKey());
        System.out.println(store.lastKey());


        System.out.println(store.get(store.firstKey()));
        System.out.println(store.get(store.lastKey()));

    }

}
