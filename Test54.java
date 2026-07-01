import java.util.*;

public class Test54 {
    public static void main(String[] args){

        Vector<String> store = new Vector<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harrish");
        store.add("Harvey");
        store.add("Harlish");

        System.out.println(store);

        store.remove(1);
        System.out.println(store);

        store.set(1,"Joan");
        System.out.println(store);

        System.out.println(store.size());

        System.out.println(store.capacity());


    }
}
