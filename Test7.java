import java.util.*;


public class Test7 {
    public static void main(String[] args){

        ArrayList<Integer> store = new ArrayList<>();

        store.add(10);
        store.add(20);
        store.add(30);
        store.add(40);
        store.add(50);

        store.removeIf(n -> n == 30) ;

        System.out.println(store);


    }

}

