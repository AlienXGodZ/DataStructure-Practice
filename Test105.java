import java.util.*;


 class StudentRecordmanagementSystem{

    TreeMap<Integer,String> store = new TreeMap<>();

    void add(int id , String name){
          store.put(id,name);
      }


      void search(int id){

           if(store.containsKey(id)){
            System.out.println("\nStudent Found: " + store.get(id));
           }else{
            System.out.println("\nStudent Not Found");
           }
      }

      void update(int id, String name){

           if(store.containsKey(id)){
                store.put(id,name);
                System.out.println("\nUpdated: " + "Name:" + store.get(id) + "|Student ID" + id);
           }else{
            System.out.println("\nNot Updated");
           }
      }

      void remove(int id){

         if(store.containsKey(id)){
                 store.remove(id);
                 System.out.println("\nSuccessfully Removed");
         }else{
             System.out.println("\nNot Removed");
         }
      }

      void total(){

          System.out.println("\nNumber of Students:" + store.size());

      }

      void exist(String name){

             if(store.containsValue(name)){
                     System.out.println("\nStudent exists");
             }else{
              System.out.println("\nStudent Not Exist");
             }
      }

      void display(){

        for(Map.Entry<Integer,String> loop : store.entrySet()){


         System.out.println("\nStudent id:" + loop.getKey() + "|Student Name: " + loop.getValue());
        }
      }

      void sortid(){

           System.out.println("\nSORTED LIST");

          TreeMap<Integer,String> loop = new TreeMap<>(store);

          for(Map.Entry<Integer,String> loop1 : loop.entrySet()){

           System.out.println("Student ID: " + loop1.getKey() + "Student name: " + loop1.getValue());

          }

      }

      void sortbyname(){

        List<Map.Entry<Integer,String>> list = new ArrayList<>(store.entrySet());

         Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){

          public int compare(Map.Entry<Integer,String> s1 , Map.Entry<Integer,String> s2){
               return s1.getValue().compareTo(s2.getValue());
          }


         });

       System.out.println("\nSorted By Student Name:");

       for (Map.Entry<Integer, String> entry : list) {
        System.out.println("Student ID: " + entry.getKey()
                + " | Student Name: " + entry.getValue());
       }
      }

        }












public class Test105 {
  public static void main(String[] args){

    StudentRecordmanagementSystem s = new StudentRecordmanagementSystem();

     s.add(101,"Jllen");
     s.add(102,"Aoan");
     s.add(103,"Harrish");
     s.add(104,"Harvey");
     s.add(105,"Bala");


     s.display();

     s.search(105);

     s.update(105,"Bala Kumar");

     s.display();

     s.remove(105);

     s.display();

     s.total();

     s.exist("Bala Kumar");

     s.sortbyname();

     s.sortid();



  }
}
