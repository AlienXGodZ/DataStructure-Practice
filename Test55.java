import java.util.*;

public class Test55 {
    public static void main(String[] args){


            ArrayList<String> store = new ArrayList<>();

            store.add("Allen");
            store.add("Joan");
            store.add("Allen");
            store.add("Harvey");
            store.add("Joan");

            System.out.println("Before :" + store);



        HashSet<String> ultrastore = new HashSet<>(store);

        System.out.println("After :" + ultrastore);


    }
}
