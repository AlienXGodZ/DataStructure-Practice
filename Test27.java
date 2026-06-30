import java.util.*;

public class Test27 {
    public static void main(String[] args){

        TreeSet<Integer> store = new TreeSet<>();

        store.add(10);
        store.add(40);
        store.add(30);
        store.add(20);
        store.add(50);

        System.out.println(store.higher(30));
        System.out.println(store.lower(30));


    }

}

