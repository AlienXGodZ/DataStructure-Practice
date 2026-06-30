import java.util.*;

public class Test34 {
    public static void main(String[] args){

        HashMap<Integer,String> store = new HashMap<>();

        store.put(1,"Allen");
        store.put(2,"Joan");
        store.put(3,"Harrish");

        store.replace(1,"Joan1");


        System.out.println(store);


    }

}


