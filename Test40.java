import java.util.*;

public class Test40 {
    public static void main(String[] args){

        TreeMap<Integer,String> store = new TreeMap<>();

        store.put(2,"Allen");
        store.put(1,"Joan");
        store.put(3,"Edwin");
        store.put(4,"Harvey");

        System.out.println(store.higherKey(3));
        System.out.println(store.lowerKey(2));


        System.out.println(store.higherEntry(3));
        System.out.println(store.lowerEntry(2));


    }

}
