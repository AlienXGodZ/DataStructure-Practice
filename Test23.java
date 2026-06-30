import java.util.*;

public class Test23 {
    public static void main(String[] args) {

        HashSet<String> store = new HashSet<>();

        store.add("BMW");
        store.add("FORD");
        store.add("JACKWOR");
        store.add("AUDIO");
        store.add("FORD");

        Iterator<String> loopstore = store.iterator();

         while(loopstore.hasNext()){
             System.out.print(loopstore.next() + " ");
         }


    }
}