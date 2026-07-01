import java.util.*;

public class Test59 {
    public static void main(String[] args){

        HashMap<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harvey");
        store.put(4,"Harrish");
        store.put(5,"Horlick");

        System.out.println(store);

        ArrayList<Integer> keystore = new ArrayList<>(store.keySet());

        System.out.println(keystore);

        ArrayList<String> valuestore = new ArrayList<>(store.values());

        System.out.println(valuestore);

    }
}
