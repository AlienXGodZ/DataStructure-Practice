import java.util.*;

  class employees{
      int id;
      String name;
      double salary;

      employees(int id,String name,double salary){

          this.id = id;
          this.name = name;
          this.salary = salary;

      }

      public String toString(){
          return "EmployeeId: " + id + "| EmployeeName:" + name + "| EmployeeSalary:" + salary;
      }
  }

      class EmployeeManagementSystem{

         ArrayList<employees> store = new ArrayList<>();

         void addemploye(employees s){
             store.add(s);
         }


         void display(){

             System.out.println("\nEmployee List");

             for(employees i : store){
                 System.out.println(i);
             }
         }

         void search(String name){

             for(employees i : store){
                 if(i.name.equals(name)){
                     System.out.println("\nEmployee Found:" + i);
                     return;
                 }
             }

            System.out.println("\nEmployee Not Found");
         }

         void update(int id,String name){

             boolean condition = false;

             for(employees i : store){
                 if(i.id == id){
                     i.name = name;
                     System.out.println("\n Employee Updated");
                     condition = true;
                     break;
                 }
             }
             if(!condition){
                 System.out.println("\nNot Updated");
             }
         }

         void exists(String name){

             boolean condition = false;

             for(employees i : store){
                 if(i.name.equals(name)){
                     System.out.println("\n Employee Exists");
                     condition = true;
                     break;
                 }
             }
             if(!condition){
                 System.out.println("\nEmployee Not Existed");
             }

         }

         void remove(String name){


         boolean condition = false;
         Iterator<employees> loop = store.iterator();

         while(loop.hasNext()){
             employees s = loop.next();

             if(s.name.equals(name)){
                 loop.remove();
                 System.out.println("\nSuccessfully Removed");
                 condition = true;
                 break;
             }
         }
         if(!condition){
             System.out.println("\nEmployee not Found");
         }
          }

          void count(){
             System.out.println("\nNumber of Employee:" + store.size());
          }

          void sortname(){

             Collections.sort(store, new Comparator<employees>(){

                 public int compare(employees s1 , employees s2){
                     return s1.name.compareTo(s2.name);
                 }
             });
             }

             void sortsalary(){

                     Collections.sort(store, new Comparator<employees>(){

                         public int compare(employees s1 , employees s2){
                             return Double.compare(s1.salary,s2.salary);
                         }
                     });
              }

          }

public class Test95 {
    public static void main(String[] args){

        EmployeeManagementSystem s = new EmployeeManagementSystem();

        s.addemploye(new employees(101,"Allen",50000));
        s.addemploye(new employees(102,"Joan",25000));
        s.addemploye(new employees(103,"Harvey",30000));
        s.addemploye(new employees(104,"Harrish",55000));
        s.addemploye(new employees(105,"Bala",75000));
        s.addemploye(new employees(106,"Dhanusha",100000));


        s.display();

        s.search("Dhanusha");

        s.exists("Bala");

        s.update(104,"Harlish");

        s.remove("Joan");

        s.count();

        s.sortname();

        s.sortsalary();





    }
}
