import java.util.*;

public class Test69 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");
        store.add("Bala");
        store.add("Allen");

        System.out.println(store);

        List<String> unModified = Collections.unmodifiableList(store);

        System.out.println(unModified);

        System.out.println(unModified.get(1)); // its is work because it only read and only work get method.

        System.out.println(unModified.set(1,"Allen")); // does not change because it is unmodified

        System.out.println(unModified.remove(1)); // does not remove because it is unmodified

        System.out.println(unModified.contains("Bala"));

    }
}
