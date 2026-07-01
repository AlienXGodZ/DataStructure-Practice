import java.util.*;

public class Test65 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Bala");
        store.add("Gogan");
        store.add("Surya");
        store.add("Vijay");

        System.out.println( Collections.frequency(store,"Allen"));

        System.out.println(Collections.min(store));
        System.out.println(Collections.max(store));

    }
}
