import java.util.*;

public class Test51 {
    public static void main(String[] args){

        PriorityQueue<String> store = new PriorityQueue<>();

        store.offer("Allen");
        store.offer("Joan");
        store.offer("Harvey");
        store.offer("Harrish");

        System.out.println(store);

        System.out.println(store.peek());

        store.poll();
        System.out.println(store);


        System.out.println(store.size());



        store.remove();
        store.remove();
        store.remove();


        System.out.println(store);

        store.clear();

        System.out.println(store);


    }
}
