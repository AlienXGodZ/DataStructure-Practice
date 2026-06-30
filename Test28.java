import java.util.*;

public class Test28 {
    public static void main(String[] args){

        TreeSet<Integer> store = new TreeSet<>();

        store.add(10);
        store.add(40);
        store.add(20);
        store.add(30);
        store.add(20);
        store.add(50);

       store.remove(20);
       System.out.println(store);

       System.out.println(store.contains(10));

       store.clear();

       System.out.println(store);


    }

}

