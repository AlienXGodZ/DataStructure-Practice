import java.util.*;

public class Test72 {
    public static void main(String[] args){

        ArrayList<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Dhanusha");
        store.add("Joan");
        store.add("Harrish");
        store.add("Harvey");

        System.out.println(store);

        ArrayList<String> ultraStore = new ArrayList<>();

        ultraStore.add("Harlish");
        ultraStore.add("Bala");
        ultraStore.add("Stella");  // if you add ultrastore.add("Dhanusha") its becomes false because its take compare both list.if any one element in same in other i becomes false. if not its becomes true;

        System.out.println(Collections.disjoint(store,ultraStore));


    }
}
