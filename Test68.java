import java.util.*;

public class Test68 {
    public static void main(String[] args){

        List<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");
        store.add("Bala");
        store.add("Allen");

        System.out.println(store);

        Collections.replaceAll(store,"Allen","AllenPeter");

        System.out.println(store);



    }
}
