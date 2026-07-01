import java.util.*;

public class Test53 {
    public static void main(String[] args){

        Stack<String> store = new Stack<>();

        store.push("Allen");
        store.push("Joan");
        store.push("Harrish");
        store.push("Harvey");
        store.push("Harlick");

        System.out.println(store);

        store.pop();

        System.out.println(store);

        System.out.println(store.peek());

        System.out.println(store.search("Allen"));


        System.out.println(store.isEmpty());




    }
}
