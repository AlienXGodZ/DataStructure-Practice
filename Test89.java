import java.util.*;

class Product {
    int id;
    String name;
    double price;
    int quantity;


    Product(int id,String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){
        return "Id: " + id + " | Name: " + name + " | price: " + price + "| Quantity: " + quantity;
    }
}

class productName implements Comparator<Product> {

    public int compare(Product s1, Product s2) {
        return s1.name.compareTo(s2.name);
    }
}


class productId implements Comparator<Product>{

    public int compare(Product s1 , Product s2){
        return Integer.compare(s1.id,s2.id);
    }
}

class productPrice implements Comparator<Product> {

    public int compare(Product s1, Product s2) {
        return Double.compare(s1.price, s2.price);
    }
}

class productQuantity implements Comparator<Product> {

    public int compare(Product s1, Product s2) {
        return Integer.compare(s1.quantity, s2.quantity);
    }
}

public class Test89 {
    public static void main(String[] args){

        ArrayList<Product> store = new ArrayList<>();

        store.add(new Product(1,"Laptop",50.000,1));
        store.add(new Product(2,"Keyboard",1000,1));
        store.add(new Product(3,"Mouse",500,2));

        System.out.println(store);

        boolean found1 = false;
        for(Product i : store){
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
        for(Product i : store){
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
        Iterator<Product> loop = store.iterator();

        while(loop.hasNext()){

            Product it = loop.next();

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

        Collections.sort(store, new productName());
        System.out.println("Sorted by ProductName: " + store);

        Collections.sort(store, new productId());
        System.out.println("Sorted by ProductID: " + store);

        Collections.sort(store, new productPrice());
        System.out.println("Sorted by ProductPrice: " + store);

        Collections.sort(store, new productQuantity());
        System.out.println("Sorted by ProductQuantity: " + store);

        System.out.println("Number of Item: "+ store.size());

        boolean found4 = false;
        for(Product i : store){
            if(i.name.equals("Laptop")){
                System.out.println("Sir Laptop is in the cart");
                found4 = true;
                break;
            }
        }

        if(!found4){
            System.out.println("Sir Laptop is not in the cart");
        }


        store.set(1,new Product(1,"SimpleFaceWash",500,2));
        System.out.println(store);


    }
}

