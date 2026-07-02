import java.util.*;

class product implements Comparable<product>{

    int price;

    product(int price){
        this.price = price;
    }

    public int compareTo(product other){
        return Integer.compare(this.price, other.price);
    }

    public String toString() {

        return String.valueOf(price);
    }
}


public class Test76 {
    public static void main(String[] args){

        ArrayList<product> store = new ArrayList<>();

        store.add(new product(20000));
        store.add(new product(15000));
        store.add(new product(10000));
        store.add(new product(25000));

        Collections.sort(store);

        System.out.println(store);


    }
}
