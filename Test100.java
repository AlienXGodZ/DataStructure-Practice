import java.util.*;

class inventoryitem{
    int id;
    String name;
    double price;
    int stock;

    inventoryitem(int id,String name,double price,int stock){

        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    public String toString(){
        return "ProductId: " + id + "| ProductName:" + name + "| ProductPrice:" + price + "|Product stock: " + stock ;
    }
}

class inventoryitemsystem{

    ArrayList<inventoryitem> store = new ArrayList<>();

    void add(inventoryitem s){
        store.add(s);
    }


    void display(){

        System.out.println("\nInventory List");

        for(inventoryitem i : store){
            System.out.println(i);
        }
    }

    void search(String productname){

        for(inventoryitem i : store){
            if(i.name.equals(productname)){
                System.out.println("\nProductName Found:" + i);
                return;
            }
        }

        System.out.println("\nProductName is Not Found");
    }

    void update(int id,String productname){

        boolean condition = false;

        for(inventoryitem i : store){
            if(i.id == id){
                i.name = productname;
                System.out.println("\n Productname Updated" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void exists(String productname){

        boolean condition = false;

        for(inventoryitem i : store){
            if(i.name.equals(productname)){
                System.out.println("\n Productname Exists" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nProductname Not Existed");
        }

    }

    void remove(String name){


        boolean condition = false;
        Iterator<inventoryitem> loop = store.iterator();

        while(loop.hasNext()){
            inventoryitem s = loop.next();

            if(s.name.equals(name)){
                loop.remove();
                System.out.println("\nSuccessfully Removed" + s);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nEmployee not Found");
        }
    }

    void count(){
        System.out.println("\nNumber of Inventory Items:" + store.size());
    }

    void sortname(){

        Collections.sort(store, new Comparator<inventoryitem>(){

            public int compare(inventoryitem s1 , inventoryitem s2){
                return s1.name.compareTo(s2.name);
            }
        });
    }

    void sortprice(){

        Collections.sort(store, new Comparator<inventoryitem>(){

            public int compare(inventoryitem s1 , inventoryitem s2){
                return Double.compare(s1.price,s2.price);
            }
        });
    }

}

public class Test100 {
    public static void main(String[] args){

        inventoryitemsystem s = new inventoryitemsystem();

        s.add(new inventoryitem(101,"Laptop",50000.00,50));
        s.add(new inventoryitem(102,"Keyboard",1500.00,150));
        s.add(new inventoryitem(103,"Mouse",500.00,500));
        s.add(new inventoryitem(104,"Monitor",5500.00,25));
        s.add(new inventoryitem(105,"Home Speaker",10000.00,105));
        s.add(new inventoryitem(106,"ps5",70000.00,55));


        s.display();

        s.search("Laptop");

        s.exists("Home Speaker");

        s.update(104,"Monitor 4K");

        s.remove("ps5");

        s.count();

        s.sortname();
        s.display();

        s.sortprice();
        s.display();





    }
}
