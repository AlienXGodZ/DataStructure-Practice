import java.util.*;


public class Test52 {
    public static void main(String[] args){

        Deque<String> store = new ArrayDeque<>();

        store.offer("Allen");
        store.offer("Joan");
        store.offer("Harrish");
        store.offer("Harvey");
        store.offer("Stella");

        System.out.println(store);

        store.addFirst("Harley");
        store.addLast("Horlick");

        System.out.println(store);

        store.removeFirst();
        store.removeLast();

        System.out.println(store);

        store.offerFirst("Harley");
        store.offerLast("Horlick");

        System.out.println(store);

        System.out.println(store.peekFirst());
        System.out.println(store.peekLast());


        store.pollFirst();
        store.pollLast();
        System.out.println(store);



    }
}
