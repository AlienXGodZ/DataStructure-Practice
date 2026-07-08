import java.util.*;

 class productcatalog{

     String productname;
     double price;

     productcatalog(String productname,double price){

         this.productname = productname;
         this.price = price;

     }

     public String toString(){
         return "PRODUCT NAME: " + productname + "| PRODUCT PRICE: " + price;
     }
 }

   class productcatalog1{

     TreeMap<Integer,productcatalog> store = new TreeMap<>();

     void add(int id ,productcatalog s){
         store.put(id,s);
     }

     void search(int id){

         if(store.containsKey(id)){
             System.out.println("\nFounded:" + "PRODUCT Name: " + store.get(id).productname + "PRODUCT PRICE: " + store.get(id).price);
         }else{
             System.out.println("\nNOT FOUNDED");
         }
     }

     void search(String productname){

         for(Map.Entry<Integer,productcatalog> loop : store.entrySet()){
             if(loop.getValue().productname.equals(productname)){
                 System.out.println("\nFounded: " + "PRODUCT ID: " + loop.getKey() + "| PRODUCT NAME:" + loop.getValue().productname + "| PRODUCT PRICE: " + loop.getValue().price );
                  return;
             }
             }

             System.out.println("\nNot Founded");
         }


     void updateProductName(int id,String productname){

         if(store.containsKey(id)){
             store.get(id).productname = productname;
             System.out.println("\nSUCCESSFULLY UPDATED: " + "| PRODUCT ID: " + id + "| PRODUCT NAME: " + store.get(id).productname + "| PRODUCT PRICE: " + store.get(id).price);
         }else{
             System.out.println("\nNot Updated");
         }
     }

     void updateprodcutPrice(String productname, double productprice){

         for(Map.Entry<Integer,productcatalog> loop : store.entrySet()){

             if(loop.getValue().productname.equals(productname)){
                 loop.getValue().price = productprice;
                 System.out.println("\nSuccessfully Updated: " + "PRODUCT ID: " + loop.getKey() + "| PRODUCT NAME:" + loop.getValue().productname + "| PRODUCT PRICE: " + loop.getValue().price );
                 return;
             }
             }
             System.out.println("\nNot Updated");

         }


     void removebyname(String productname){

         Iterator<Map.Entry<Integer,productcatalog>> loop = store.entrySet().iterator();

         while(loop.hasNext()){

             Map.Entry<Integer,productcatalog> i = loop.next();

             if(i.getValue().productname.equals(productname)){
                 loop.remove();
                 System.out.println("\nsuccessfully Removed:" + "PRODUCT NAME: " + i.getValue().productname + "PRODUCT PRICE" + i.getValue().price);
                 return;
             }
             }
         System.out.println("\nNot Removed");

         }

         void removebyid(int id){

         if(store.containsKey(id)){
             System.out.println("\nSUCCESSFULLY REMOVED:" + store.remove(id));
         }else{
             System.out.println("\nNot Removed");
         }
     }

     void display(){


         for(Map.Entry<Integer,productcatalog> s1 : store.entrySet()){

             System.out.println(s1);
         }

     }

     void count(){

         System.out.println("\nNumber of Product:" + store.size());
     }

     void productExist(int id){

         if(store.containsKey(id)){
             System.out.println("Product Exist: " + "| PRODUCT NAME: " + store.get(id).productname + "| PRODUCT PRICE: "  + store.get(id).price);
         }else{
             System.out.println("Product is Not Exists");
         }
     }
   }


public class Test113 {
    public static void main(String[] args){


        productcatalog1 s1 = new productcatalog1();

        s1.add(101,new productcatalog("LAPTOP",50000.00));
        s1.add(102,new productcatalog("Mouse",500.00));
        s1.add(103,new productcatalog("Keyboard",2000.00));
        s1.add(104,new productcatalog("Monitor",12000.00));
        s1.add(105,new productcatalog("Speaker",5500.00));

        s1.display();

        s1.updateprodcutPrice("Monitor",15000.00);

        s1.updateProductName(101,"LAPTOP 4K");

        s1.count();

        s1.productExist(101);

        s1.search(101);

        s1.search("Monitor");

        s1.removebyid(102);

        s1.removebyname("Speaker");


    }
}
