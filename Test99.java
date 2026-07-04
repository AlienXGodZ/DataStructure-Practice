import java.util.*;

class shoppingcart {

    String product;
    double price;
    int quantity;

    shoppingcart(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){

        return "Product Name :" + product  + "|Price :" + price + "|Quantity:" + quantity;

    }
}

class shoppingcartsystem{

    ArrayList<shoppingcart> store = new ArrayList<>();

    void addproduct(shoppingcart s){
        store.add(s);
    }


    void search(String product){

        boolean condition = false;

        for(shoppingcart i : store){

            if(i.product.equals(product)){
                System.out.println("\nProduct Founded:" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nProduct Not Found");
        }
    }

    void update (String product  , double price){

        boolean condition = false;

        for(shoppingcart i : store){
            if(i.product.equals(product)){
                i.price = price;
                System.out.println("\nUpdated: " + i);
                condition = true;
                break;
            }
        }

        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void remove(int quantity){

        boolean condition = false;
        Iterator<shoppingcart> loop = store.iterator();

        while(loop.hasNext()){
            shoppingcart search = loop.next();

            if(search.quantity == quantity){
                loop.remove();
                condition = true;
                System.out.println("\nSuccessfully ShoppingCart removed");
                break;
            }
        }
        if(!condition){
            System.out.println("\nShopping card is not found");
        }
    }

    void display(){

        System.out.println("\nShopping Card List:");

        for(shoppingcart i : store){

            System.out.println(i);

        }
    }

    void sortname() {

        Collections.sort(store, new Comparator<shoppingcart>() {
            @Override
            public int compare(shoppingcart s1, shoppingcart s2) {
                return s1.product.compareTo((s2.product));
            }
        });

        System.out.println("\nSorted By Product:" + store);

    }


    void sortprice(){

        Collections.sort(store, new Comparator<shoppingcart>() {
            @Override
            public int compare(shoppingcart s1, shoppingcart s2) {
                return Double.compare(s1.price,s2.price);
            }
        });

        System.out.println("\nSorted By Price:" + store);

    }

    void countProduct(){

        System.out.println("\nThe Number of Shopping card:" + store.size());

    }

    void productExists(String name) {

        for (shoppingcart s : store) {
            if (s.product.equals(name)) {
                System.out.println("\nProduct Exists");
                return;
            }
        }

        System.out.println("\nProduct Does Not Exist");
    }
}


public class Test99{
    public static void main(String[] args){

        shoppingcartsystem s = new shoppingcartsystem();


        s.addproduct(new shoppingcart("Keyboard",1500.00,10));
        s.addproduct(new shoppingcart("Mouse",500.00,25));
        s.addproduct(new shoppingcart("Laptop",50000.00,5));
        s.addproduct(new shoppingcart("Monitor",10000.00,10));
        s.addproduct(new shoppingcart("Home Speaker",5500.00,15));


        s.display();

        s.search("Laptop");

        s.countProduct();

        s.update("Home Speaker",6000.00);

        s.sortname();
        s.display();

        s.sortprice();
        s.display();

        s.remove(25);

        s.display();

        s.productExists("Laptop");



    }




}