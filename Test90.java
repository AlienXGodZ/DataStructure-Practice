import java.util.*;

class inventory {
    int id;
    String name;
    double price;
    int stock;


    inventory(int id,String name, double price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString(){
        return "Id: " + id + " | Name: " + name + " | price: " + price + "| Stock: " + stock;
    }
}

class stockName implements Comparator<inventory> {

    public int compare(inventory s1, inventory s2) {
        return s1.name.compareTo(s2.name);
    }
}


class stockId implements Comparator<inventory>{

    public int compare(inventory s1 , inventory s2){
        return Integer.compare(s1.id,s2.id);
    }
}

class stockPrice implements Comparator<inventory> {

    public int compare(inventory s1, inventory s2) {
        return Double.compare(s1.price, s2.price);
    }
}

class stockinHand implements Comparator<inventory> {

    public int compare(inventory s1, inventory s2) {
        return Integer.compare(s1.stock, s2.stock);
    }
}

public class Test90 {
    public static void main(String[] args){

        ArrayList<inventory> store = new ArrayList<>();

        store.add(new inventory(1,"Laptop",50000,10));
        store.add(new inventory(2,"Keyboard",1000,5));
        store.add(new inventory(3,"Mouse",500,3));

        System.out.println(store);

        boolean found1 = false;
        for(inventory i : store){
            if(i.name.equals("Laptop")){
                System.out.println("Founded: " +i);
                found1 = true;
                break;
            }
        }

        if(!found1){
            System.out.println("Item is not FOUND!");
        }

        boolean found2 = false;
        for(inventory i : store){
            if(i.price == 1000){
                i.price = 1100;
                System.out.println("Updated: " + i);
                found2 = true;
                break;
            }
        }

        if(!found2){
            System.out.println("Item Not FOUND!");
        }


        boolean found3 = false;
        Iterator<inventory> loop = store.iterator();

        while(loop.hasNext()){

            inventory it = loop.next();

            if(it.name.equals("Mouse")){
                loop.remove();
                System.out.println(store);
                found3 = true;
                break;
            }
        }

        if(!found3){
            System.out.println("Item Not Found");
        }

        Collections.sort(store, new stockName());
        System.out.println("Sorted by ProductName: " + store);

        Collections.sort(store, new stockId());
        System.out.println("Sorted by ProductID: " + store);

        Collections.sort(store, new stockPrice());
        System.out.println("Sorted by ProductPrice: " + store);

        Collections.sort(store, new stockinHand());
        System.out.println("Sorted by stock: " + store);

        System.out.println("Number of Item: "+ store.size());

        boolean found4 = false;
        for(inventory i : store){
            if(i.name.equals("Laptop")){
                System.out.println("Laptop is available in the inventory");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Laptop is not in the cart");
        }


        store.set(1,new inventory(1,"Monitor",500,2));
        System.out.println(store);


    }
}

