import java.util.*;

public class Test19 {
    public static void main(String[] args){

        LinkedList<String> store = new LinkedList<>();

        store.add("Allen");
        store.add("Harvey");
        store.add("Joan");
        store.add("Harrish");
        store.add("Stella");

        System.out.println(store.size());
        store.clear();
        System.out.println(store);
    }
}
