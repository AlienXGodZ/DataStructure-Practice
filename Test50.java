import java.util.*;

public class Test50 {
    public static void main(String[] args){

       Queue<String> store = new LinkedList<String>();

       store.offer("Allen");
       store.offer("Joan");
       store.offer("Harrish");
       store.offer("Harvey");

       System.out.println(store);

        store.add("Allen");
        store.add("Joan");
        store.add("Harrish");
        store.add("Harvey");

        System.out.println(store);


        System.out.println(store.peek());

        store.poll();
        System.out.println(store);

        System.out.println(store.element());

        store.remove();

        System.out.println(store);


        System.out.println(store.size());

        System.out.println(store.isEmpty());

        System.out.println(store.contains("Harvey"));

        store.clear();

        System.out.println(store);


    }
}
