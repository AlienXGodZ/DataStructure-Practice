import java.util.*;

public class Test49 {
  public static void main(String[] args){

      ArrayList<String> store = new ArrayList<>();

        store.add("Allen");
        store.add("Joan");
        store.add("Harvey");
        store.add("Harrish");

        Iterator<String> loop = store.iterator();

        while(loop.hasNext()){

            String next = loop.next();

            if(next.equals("Joan")){
                loop.remove();
            }else{
                System.out.println(next);
            }

        }

        System.out.println(store);



  }
}
