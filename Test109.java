import java.util.*;

 class queuepatient{

     String name;
     int age;

     queuepatient(String name,int age){

         this.name = name;
         this.age = age;
     }

     public String toString(){
         return "PATIENT NAME: " + name + " | PATIENT AGE: " + age;
     }
 }

   class queuemanagementsystem{

      Queue<queuepatient> store = new LinkedList<>();

      void add(queuepatient s){
          store.offer(s);
      }

     void servePatient(){

          if(store.isEmpty()){
              System.out.println("\nNo Patient in Queue");
          }else{
              System.out.println("\nServed Patient:" + store.poll());
          }

     }

     void nextPatient(){

         if(store.isEmpty()){
             System.out.println("\nNo Patient in Queue");
         }else{
             System.out.println("\nNext Patient:" + store.peek());
         }
     }

     void display() {

         System.out.println("\nNEXT PATIENTLIST: ");

         if (store.isEmpty()) {
             System.out.println("Queue is Empty");
             return;
         } else {

             for (queuepatient i : store) {
                 System.out.println(i);
             }
         }
     }

     void countPatient(){

          System.out.println("\nNumber of TotalPatient: " + store.size());

     }

     void checkEmpty(){

          if(store.isEmpty()){
              System.out.println("\nQueue Empty");
          }else{
              System.out.println("\nQueue is not Empty");
          }
     }

     void sortname(){

          System.out.println();

          List<queuepatient> sorted = new ArrayList<>(store);

          Collections.sort(sorted,new Comparator<queuepatient>(){

              public int compare(queuepatient s1, queuepatient s2){

                  return s1.name.compareTo(s2.name);
              }


          });

          for(queuepatient i : sorted){

              System.out.println(i);
          }
     }
   }

public class Test109 {
    public static void main(String[] args){

        queuemanagementsystem s = new queuemanagementsystem();

        s.add(new queuepatient("ALLEN",15));
        s.add(new queuepatient("JOAN",18));
        s.add(new queuepatient("HARVEY",20));
        s.add(new queuepatient("HARRISH",25));
        s.add(new queuepatient("BALA",30));


        s.servePatient();

        s.nextPatient();

        s.countPatient();

        s.checkEmpty();

        s.display();

        s.sortname();

    }
}
