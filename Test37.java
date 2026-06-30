import java.util.*;

public class Test37 {
    public static void main(String[] args){

        HashMap<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harrish");

        System.out.println("Print keys: ");

        for(int i : store.keySet()){

            System.out.println(i);

        }

        System.out.println("Print Values");

        for(int i : store.keySet()){

            System.out.println(store.get(i));

        }

    }

}


