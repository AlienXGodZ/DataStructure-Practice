import java.util.*;

public class Test60 {
    public static void main(String[] args){

        Map<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harvey");
        store.put(4,"Harrish");
        store.put(5,"Horlick");

        System.out.println(store);

        List<Integer> keystore = new ArrayList<>(store.keySet());

        System.out.println(keystore);

        List<String> valuestore = new ArrayList<>(store.values());

        System.out.println(valuestore);

    }
}
