import java.util.*;

public class Test29 {
    public static void main(String[] args){

        TreeSet<Integer> store = new TreeSet<>();

        store.add(10);
        store.add(40);
        store.add(20);
        store.add(30);
        store.add(20);
        store.add(50);

        Iterator<Integer> ultrastore = store.iterator();

        while(ultrastore.hasNext()){
            System.out.print(ultrastore.next() + " ");
        }


    }

}

