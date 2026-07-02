import java.util.*;

public class Test70 {
    public static void main(String[] args){

        Set<String> store = new HashSet<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");
        store.add("Bala");
        store.add("Allen");

        System.out.println(store);

        Set<String> unModified = Collections.unmodifiableSet(store);

        System.out.println(unModified.contains("Bala"));

        System.out.println(unModified);

        System.out.println(unModified.remove(1)); // does not remove because it is unmodified


    }
}
