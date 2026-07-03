import java.util.*;

 class Employee{
     int id;
     String name;
     double salary;

     Employee(int id, String name,double salary){
         this.id = id;
         this.name = name;
         this.salary = salary;
     }

     public String toString(){
         return "Employee id: " + id + " " + "Employee Name: " + name + " " + "Employee Salary: " +  salary;
     }

 }

   class EmployeeName implements Comparator<Employee>{

       public int compare(Employee s1, Employee s2){
           return s1.name.compareTo(s2.name);
       }
   }

   class EmployeeSalary implements Comparator<Employee>{

     public int compare(Employee s1, Employee s2) {
       return Double.compare(s1.salary,s2.salary);
     }
   }

public class Test85 {
    public static void main(String[] args){

        ArrayList<Employee> store = new ArrayList<>();

        store.add(new Employee(9123,"Allen",25000));
        store.add(new Employee(9124,"Joan",20000));
        store.add(new Employee(9125,"Gladwin",50000));
        store.add(new Employee(9126,"Stella",55000));
        store.add(new Employee(9127,"Bala",35000));

        System.out.println(store);


        boolean found = false;
        for(Employee i : store){
            if(i.name.equals("Joan")){
                found = true;
                System.out.println("Found Employee: " + i.name);
                break;
            }
            }

        if(!found){
            System.out.println("Employee Not Found");
        }

        boolean found1 = false;
        for(Employee i : store){
            if(i.name.equals("Bala")){
                i.name = "Dhanusha";
                found1 = true;
                System.out.println(store);
                break;
            }
        }

        if(!found1){
            System.out.println("Employee Not Found");
        }

       boolean found5 = false;
        Iterator<Employee> loop = store.iterator();
          while(loop.hasNext()){
              Employee it = loop.next();
              if(it.name.equals("Gladwin")){
                  loop.remove();
                  found5 = true;
                  break;
              }
        }

          if(!found5){
              System.out.println("Employee Not Found");
          }


        Collections.sort(store,new EmployeeName());
        System.out.println("Sorted By Name: " + store);

        Collections.sort(store,new EmployeeSalary());
        System.out.println("Sorted by Salary: " + store);


        boolean found3 = false;
        for(Employee i : store){
            if(i.name.equals("Dhanusha")){
                found3 = true;
                System.out.println("Exist: " + i);
                break;
            }
        }

        if(!found3){
            System.out.println("Employee Not Exist");
        }




    }
}
