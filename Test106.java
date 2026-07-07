import java.util.*;

 class employeemanagmentsystem1 {
     String name;
     double salary;


     employeemanagmentsystem1(String name, double salary) {

         this.name = name;
         this.salary = salary;

     }

     public String toString() {
         return  "Employee Name: " + name + "|Employee Salary" + salary;

     }
 }


  class EmployeeManagementSystem1{

         HashMap<Integer,employeemanagmentsystem1> store = new HashMap<>();

         void add(int id,employeemanagmentsystem1 s){
             store.put(id,s);
  }


        void display(){

             System.out.println("\nEmployees List");

             for(Map.Entry<Integer,employeemanagmentsystem1> loop : store.entrySet()){

                 System.out.println("\nEmployee ID: " + loop.getKey() + "|Employee Name: " + loop.getValue().name + "|Employee Salary: " + loop.getValue().salary);

             }
        }

        void search(String name) {


            for (Map.Entry<Integer, employeemanagmentsystem1> loop : store.entrySet()) {

                if (loop.getValue().name.equals(name)) {
                    System.out.println("\nEmployee Founded: " + loop.getKey() +"|Employee Name: " + loop.getValue().name + "|Employee Salary" +  loop.getValue().salary );
                     return;
                 }
                }
            System.out.println("\n Not Found");
            }


        void updatename(int id,String name){

             if(store.containsKey(id)){
                 store.get(id).name = name;
                 System.out.println("\nSuccessfully UpdatedName: " + store.get(id) + "|" + store.get(id).name + "|" + store.get(id).salary);
             }else{
                 System.out.println("\nNot updated");
             }
        }

        void updateSalary (int id,double name){

             if(store.containsKey(id)){
                 store.get(id).salary = name;
                 System.out.println("\nUpdated Salary: " + store.get(id) + "|" + store.get(id).name + "|" + store.get(id).salary);
             }else{
                 System.out.println("\nNot Update");
             }
        }

        void exist(String name){

             for(Map.Entry<Integer,employeemanagmentsystem1> loop : store.entrySet()){

                 if(loop.getValue().name.equals(name)){
                     System.out.println("\nEmployee Exists" + loop.getKey() + "|" + loop.getValue().name + "|" + loop.getValue().salary);
                     return;
                 }
        }
            System.out.println("Employee Not exists");
  }

      void remove(int id){

          if(store.containsKey(id)){
              store.remove(id);
              System.out.println("\n Successfully Removed");
          }else{
              System.out.println("\nNot Removed");
          }
         }


    void countEmployee(){

         System.out.println("\nNumber of Employee: " + store.size());
         }

         void sortkey(){

             System.out.println("\nSORTED BY ID");

             TreeMap<Integer,employeemanagmentsystem1> store1 = new TreeMap<>(store);

             for(Map.Entry<Integer,employeemanagmentsystem1> loop : store1.entrySet()){

                 System.out.println("Employee Name: " + loop.getValue().name + "|Employee ID: " + loop.getKey() + "|Employee Salary: " + loop.getValue().salary);
             }
         }

         void sortname(){

             List<Map.Entry<Integer,employeemanagmentsystem1>> list = new ArrayList<>(store.entrySet());

             Collections.sort(list,new Comparator<Map.Entry<Integer,employeemanagmentsystem1>>(){

                 public int compare(Map.Entry<Integer,employeemanagmentsystem1> s1 , Map.Entry<Integer,employeemanagmentsystem1> s2){
                     return s1.getValue().name.compareTo(s2.getValue().name);
                 }

             });

             System.out.println("\n SORTED BY NAME:");
             for(Map.Entry<Integer,employeemanagmentsystem1> list2 : list){

                 System.out.println("EMPLOYEE ID: " + list2.getKey() + "|EMPLOYEE NAME: " + list2.getValue().name + "|EMPLOYEE SALARY: " + list2.getValue().salary);

             }



         }
  }

public class Test106 {
    public static void main(String[] args){

        EmployeeManagementSystem1 s = new EmployeeManagementSystem1();

        s.add(101 ,new employeemanagmentsystem1("Allen",20000));
        s.add(102, new employeemanagmentsystem1("Joan",50000));
        s.add(103, new employeemanagmentsystem1("Harvey",25000));
        s.add(104,new employeemanagmentsystem1("Harlish",10000));
        s.add(105,new employeemanagmentsystem1("Bala",100000));


        s.search("Bala");

        s.sortkey();


        s.sortname();


        s.updatename(101,"Allen Harley");

        s.exist("Harlish");

        s.remove(105);
        s.display();

        s.exist("Bala");

        s.updateSalary(101,1000000);

        s.countEmployee();



    }
}
