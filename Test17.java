import java.util.*;

public class Test17 {
    public static void main(String[] args){

        LinkedList<String> store = new LinkedList<>();

        store.add("Allen");
        store.add("Harvey");
        store.add("Joan");
        store.add("Harrish");
        store.add("Stella");

        store.removeFirst();
        store.removeLast();

        System.out.println(store);
    }
}
