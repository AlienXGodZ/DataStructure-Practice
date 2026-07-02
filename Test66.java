import java.util.*;

public class Test66 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");
        store.add("Bala");

        System.out.println(store);

        List<String> extraStore = new ArrayList<>();

        extraStore.add("A");
        extraStore.add("B");
        extraStore.add("C");
        extraStore.add("D");
        extraStore.add("E");

        Collections.copy(extraStore,store);

        System.out.println(extraStore);

    }
}
