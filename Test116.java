import java.util.*;

class Employee123 {

    int id;
    String name;
    double salary;

    Employee123(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
                " | Employee Name: " + name +
                " | Employee Salary: " + salary;
    }
}

class EmployeeManagementSystem123 {

    ArrayList<Employee123> store = new ArrayList<>();

    void add(Employee123 e) {
        store.add(e);
    }

    void display() {

        System.out.println("\nEmployee List:");

        for (Employee123 e : store) {
            System.out.println(e);
        }
    }

    void search(int id) {

        for (Employee123 e : store) {

            if (e.id == id) {
                System.out.println("\nEmployee Found:");
                System.out.println(e);
                return;
            }
        }

        System.out.println("\nEmployee Not Found");
    }

    void updateName(int id, String name) {

        for (Employee123 e : store) {

            if (e.id == id) {

                e.name = name;
                System.out.println("\nEmployee Name Updated");
                return;
            }
        }

        System.out.println("\nEmployee Not Found");
    }

    void updateSalary(int id, double salary) {

        for (Employee123 e : store) {

            if (e.id == id) {

                e.salary = salary;
                System.out.println("\nEmployee Salary Updated");
                return;
            }
        }

        System.out.println("\nEmployee Not Found");
    }

    void remove(int id) {

        Iterator<Employee123> it = store.iterator();

        while (it.hasNext()) {

            Employee123 e = it.next();

            if (e.id == id) {

                it.remove();
                System.out.println("\nEmployee Removed");
                return;
            }
        }

        System.out.println("\nEmployee Not Found");
    }

    void countEmployees() {

        System.out.println("\nTotal Employees: " + store.size());
    }

    void employeeExists(int id) {

        for (Employee123 e : store) {

            if (e.id == id) {

                System.out.println("\nEmployee Exists");
                return;
            }
        }

        System.out.println("\nEmployee Does Not Exist");
    }

    void sortByName() {

        Collections.sort(store, new Comparator<Employee123>() {

            @Override
            public int compare(Employee123 e1, Employee123 e2) {

                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("\nEmployees Sorted By Name:");

        for (Employee123 e : store) {
            System.out.println(e);
        }
    }

    void sortBySalary() {

        Collections.sort(store, new Comparator<Employee123>() {

            @Override
            public int compare(Employee123 e1, Employee123 e2) {

                return Double.compare(e1.salary, e2.salary);
            }
        });

        System.out.println("\nEmployees Sorted By Salary:");

        for (Employee123 e : store) {
            System.out.println(e);
        }
    }
}

public class Test116 {

    public static void main(String[] args) {

        EmployeeManagementSystem123 s = new EmployeeManagementSystem123();

        s.add(new Employee123(101, "Allen", 50000));
        s.add(new Employee123(103, "Harvey", 35000));
        s.add(new Employee123(105, "Bala", 70000));
        s.add(new Employee123(102, "Joan", 45000));
        s.add(new Employee123(104, "Harlish", 60000));

        s.display();

        s.search(103);

        s.updateSalary(103, 40000);

        s.updateName(105, "Bala Kumar");

        s.display();

        s.employeeExists(102);

        s.remove(102);

        s.display();

        s.countEmployees();

        s.sortByName();

        s.sortBySalary();
    }
}