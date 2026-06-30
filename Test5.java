import java.util.*;


public class Test5 {
    public static void main(String[] args){

        ArrayList<Integer> store = new ArrayList<>();

        store.add(10);
        store.add(20);
        store.add(30);
        store.add(40);
        store.add(50);

        for(int i = 0 ; i < store.size() ; i++){
            System.out.print(store.get(i) + " ");
        }

    }
}
