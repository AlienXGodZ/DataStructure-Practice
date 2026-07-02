import java.util.*;

public class Test71 {
    public static void main(String[] args){

        Map<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harvey");
        store.put(4,"Harrish");
        store.put(5,"Bala");
        store.put(6,"Allen");

        System.out.println(store);

        Map<Integer,String> unModified = Collections.unmodifiableMap(store);

        System.out.println(unModified.containsKey(1));

        System.out.println(unModified);

        System.out.println(unModified.remove(1)); // does not remove because it is unmodified


    }
}
