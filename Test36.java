import java.util.*;

public class Test36 {
    public static void main(String[] args){

        HashMap<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harrish");


        System.out.println(store.containsKey(1));

        System.out.println(store.containsValue("Allen"));


    }

}


