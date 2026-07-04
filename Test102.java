import java.util.*;

class hospitalpatient{
    int id;
    String name;
    String disease;
    int age;

    hospitalpatient(int id,String name,String disease,int age){

        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;

    }

    public String toString(){
        return "PatientId: " + id + "| PatienttName:" + name + "| PatientAge:" + age + "|Patient disease: " + disease ;
    }
}

class hospitalpatientsystem{

    ArrayList<hospitalpatient> store = new ArrayList<>();

    void add(hospitalpatient s){
        store.add(s);
    }


    void display(){

        System.out.println("\nHospital Patient List");

        for(hospitalpatient i : store){
            System.out.println(i);
        }
    }

    void search(String patientname){

        for(hospitalpatient i : store){
            if(i.name.equals(patientname)){
                System.out.println("\nPatient Found:" + i);
                return;
            }
        }

        System.out.println("\nPatient is Not Found");
    }

    void update(int id,String patientname){

        boolean condition = false;

        for(hospitalpatient i : store){
            if(i.id == id){
                i.name = patientname;
                System.out.println("\n Patientname Updated" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nNot Updated");
        }
    }

    void exists(String patientname){

        boolean condition = false;

        for(hospitalpatient i : store){
            if(i.name.equals(patientname)){
                System.out.println("\n Patient Name Exists" + i);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nPatient Not Existed");
        }

    }

    void remove(String patientname){


        boolean condition = false;
        Iterator<hospitalpatient> loop = store.iterator();

        while(loop.hasNext()){
            hospitalpatient s = loop.next();

            if(s.name.equals(patientname)){
                loop.remove();
                System.out.println("\nSuccessfully Removed" + s);
                condition = true;
                break;
            }
        }
        if(!condition){
            System.out.println("\nPatient not Found");
        }
    }

    void count(){
        System.out.println("\nNumber of Patient in the Hospital:" + store.size());
    }

    void sortname(){

        Collections.sort(store, new Comparator<hospitalpatient>(){

            public int compare(hospitalpatient s1 , hospitalpatient s2){
                return s1.name.compareTo(s2.name);
            }
        });
    }

    void sortage(){

        Collections.sort(store, new Comparator<hospitalpatient>(){

            public int compare(hospitalpatient s1 , hospitalpatient s2){
                return Integer.compare(s1.age,s2.age);
            }
        });
    }

}

public class Test102 {
    public static void main(String[] args){

        hospitalpatientsystem s = new hospitalpatientsystem();

        s.add(new hospitalpatient(101,"Allen","sugar",20));
        s.add(new hospitalpatient(102,"Joan","Acid Reflex",21));
        s.add(new hospitalpatient(103,"Dhanusha","Cancer",15));
        s.add(new hospitalpatient(104,"Stella","Sleepless",25));
        s.add(new hospitalpatient(105,"Harvey","Ulcer",19));
        s.add(new hospitalpatient(106,"Harrish","stomach upset",24));


        s.display();

        s.search("Allen");

        s.exists("Dhanusha");

        s.update(104,"Stella Florene");

        s.remove("Dhanusha");

        s.count();

        s.sortname();
        s.display();

        s.sortage();
        s.display();





    }
}
