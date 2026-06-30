import java.util.*;


public class Test44 {
    public static void main(String[] args){

        TreeMap<Integer,String> store = new TreeMap<>();

        store.put(2,"Allen");
        store.put(1,"Joan");
        store.put(3,"Edwin");
        store.put(4,"Harvey");


        for(Map.Entry <Integer,String> ultrastore : store.entrySet()){

            System.out.println(ultrastore.getKey()  + " " + ultrastore.getValue());
        }



    }

}




