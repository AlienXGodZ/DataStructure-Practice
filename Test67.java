import java.util.*;

public class Test67 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");
        store.add("Bala");

        System.out.println(store);

        Collections.fill(store,"Allen");

        System.out.println(store);



    }
}
