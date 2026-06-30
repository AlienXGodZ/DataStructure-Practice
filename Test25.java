import java.util.*;

public class Test25 {
    public static void main(String[] args){

        TreeSet<Integer> store = new TreeSet<>();

        store.add(10);
        store.add(40);
        store.add(30);
        store.add(20);
        store.add(50);

        System.out.println(store.first());
        System.out.println(store.last());


    }

}

