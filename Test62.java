import java.util.*;

public class Test62 {
    public static void main(String[] args){

        ArrayList<String> store = new ArrayList<>();

        store.add("Joan");
        store.add("Allen");

        store.add("Vinoth");
        store.add("Harvey");
        store.add("Bala");

        Collections.reverse(store);

        System.out.println(store);

        Collections.sort(store,Collections.reverseOrder()); //sorted order

        System.out.println(store);






    }
}
