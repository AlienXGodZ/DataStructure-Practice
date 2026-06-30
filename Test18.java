import java.util.*;

public class Test18 {
    public static void main(String[] args){

        LinkedList<String> store = new LinkedList<>();

        store.add("Allen");
        store.add("Harvey");
        store.add("Joan");
        store.add("Harrish");
        store.add("Stella");

        System.out.println(store.getFirst());
        System.out.println(store.getLast());
    }
}
