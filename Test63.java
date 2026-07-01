import java.util.*;

public class Test63 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Bala");
        store.add("Gogan");
        store.add("Surya");
        store.add("Vijay");

        Collections.shuffle(store);

        System.out.println(store);

    }
}
