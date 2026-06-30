import java.util.*;


public class Test3 {
    public static void main(String[] args){

        ArrayList<Integer> store = new ArrayList<>();

        store.add(10);
        store.add(20);
        store.add(30);
        store.add(40);
        store.add(50);

        store.set(2,99);

        System.out.println(store);

    }
}
