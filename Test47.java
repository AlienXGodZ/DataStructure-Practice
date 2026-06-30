import java.util.*;

public class Test47 {
    public static void main(String[] args){

        LinkedHashMap<Integer,String> store = new LinkedHashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harrish");
        store.put(4,"Harvey");

        store.replace(2,"Allen");

        store.remove(3);

        System.out.println(store);

    }
}
