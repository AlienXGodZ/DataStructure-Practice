import java.util.*;


 class phoneBook {

     HashMap<String, String> store = new HashMap<>();

     void add(String name, String letter) {
         store.put(name, letter);
     }

     void display() {

         System.out.println("\nPhoneBook List:");

         for (Map.Entry<String, String> loop : store.entrySet()) {

             System.out.println("Name: " + loop.getKey() + "Number:" + loop.getValue());

         }
     }

     void search(String ContactName) {

         if (store.containsKey(ContactName)) {
             System.out.println("\nNumber Found: " + store.get(ContactName));
         } else {
             System.out.println("\nNot Founed");
         }
     }

     void update(String contactname, String contactnumber) {

         if (store.containsKey(contactname)) {
             store.put(contactname, contactnumber);
             System.out.println("\nContact Updated");
         } else {
             System.out.println("\nContact Not Updated");
         }
     }

     void total() {
         System.out.println("\nNumber of Contact: " + store.size());
     }

     void remove(String name) {

         Iterator<Map.Entry<String, String>> loop = store.entrySet().iterator();

         while (loop.hasNext()) {
             Map.Entry<String, String> s = loop.next();

             if (s.getKey().equals(name)) {
                 loop.remove();
                 System.out.println("\nRemoved:" + s);
                 return;
             }
         }
         System.out.println("\nNot removed");
     }

     void exist(String ContactName){

         if(store.containsKey(ContactName)){
             System.out.println("\nExitst:" + store.get(ContactName));
         }else{
             System.out.println("\nNot Exist");
         }
     }

     void sortbyname(){

         TreeMap<String,String> loop1 = new TreeMap<>(store);

         for( Map.Entry<String,String>  loop : loop1.entrySet()){

             System.out.println("\nContactName: " + loop.getKey() + "|ContactNumber: " + loop.getValue());

         }
     }
 }


 public class Test104{
     public static void main(String[] args){

         phoneBook s = new phoneBook();

         s.add("Allen","1111111111");
         s.add("Joan","22222222");
         s.add("Harvey","333333333");
         s.add("Harrish","444444444");
         s.add("Bala","5555555555");


         s.search("Joan");

         s.remove("Bala");

         s.sortbyname();

         s.total();

         s.update("Harrish","99999999999");
         s.display();

         s.exist("Bala");

         s.display();




     }
 }


