import java.util.*;

public class Test64 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Bala");
        store.add("Gogan");
        store.add("Surya");
        store.add("Vijay");

        Collections.swap(store,2,3);

        System.out.println(store);

    }
}
