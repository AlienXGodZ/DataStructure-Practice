import java.util.*;

public class Test30 {
    public static void main(String[] args){

        LinkedHashSet<Integer> store = new LinkedHashSet<>();

        store.add(10);
        store.add(40);
        store.add(20);
        store.add(30);
        store.add(20);
        store.add(50);

        System.out.println(store);

    }

}

