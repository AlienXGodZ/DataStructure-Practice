import java.util.*;

public class Test22 {
    public static void main (String[] args){

        HashSet<String> store = new HashSet<>();

        store.add("BMW");
        store.add("FORD");
        store.add("JACKWOR");
        store.add("AUDIO");
        store.add("FORD");

        System.out.println(store.contains("FORD"));
        System.out.println(store.size());

        store.clear();

        System.out.println(store);
    }
}
