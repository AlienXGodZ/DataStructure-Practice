import java.util.*;


class courseregistration{

    int id;
    String name;
    String duration;
    String trainer;


    courseregistration(int id ,String name , String duration , String trainer){

        this.id = id;
        this.name = name;
        this.duration = duration;
        this.trainer = trainer;
    }

    public String toString(){
        return "COURSE ID: " + id + "COURSE NAME: " + name + "| COURSE DURATION: " + duration + "| COURSE TRAINER: " + trainer;
    }
}

class coursregristrationSystem{

    ArrayList<courseregistration> store = new ArrayList<>();

    void add(courseregistration s){
        store.add(s);
    }

    void display(){
        System.out.println("\nOur Course List");

        for(courseregistration i : store){
            System.out.println(i);
        }
    }

    void Search(String name){

        for(courseregistration i : store){
            if(i.name.equals(name)){
                System.out.println("\nCourse Founded" + i);
                return;
            }
        }
        System.out.println("\nCourse Not Founded");
    }

    void update(String name,String duration){

        for(courseregistration i : store){

            if(i.name.equals(name)){
                i.duration = duration;
                System.out.println("\nSuccessfully Updated" + i);
                return;
            }
        }
        System.out.println("\nNot Updated");
    }

    void remove(String name){

        Iterator<courseregistration> loop = store.iterator();

        while(loop.hasNext()){
            courseregistration x = loop.next();

            if(x.name.equals(name)){
                loop.remove();
                System.out.println("\nSuccessully Course Removed" + x);
                return;
            }
        }
        System.out.println("NOt removed");
    }


    void sortName(){

        Collections.sort(store, new Comparator<courseregistration>(){

            public int compare(courseregistration s1 , courseregistration s2){

                return s1.name.compareTo(s2.name);
            }
        });
    }

    void sortid(){

        Collections.sort(store, new Comparator<courseregistration>(){

            public int compare(courseregistration s1 , courseregistration s2){

                return Integer.compare(s1.id,s2.id);
            }
        });
    }

    void total() {

        System.out.println("\nNumber of Regristration: " + store.size());
    }

    void exists(String name){

        for(courseregistration i : store){
            if(i.name.equals(name)) {
                System.out.println("\nCourse exists" + i);
                return;
            }
        }
        System.out.println("\nCourse is not exist");
    }

}

public class Test103 {
    public static void main(String[] args){

        coursregristrationSystem s = new coursregristrationSystem();

        s.add(new courseregistration(101,"JAVA","4 Months","By Allen"));
        s.add(new courseregistration(102,"C++","6 Months","By Joan"));
        s.add(new courseregistration(103,"C","8 Months","By Stella"));
        s.add(new courseregistration(104,"SQL","2 Months","By Bala"));
        s.add(new courseregistration(105,"PYTHON","4 Months","By Dhanusha"));
        s.add(new courseregistration(106,"JDSE","3 Months","By Harvey"));

        s.display();

        s.Search("JAVA");

        s.exists("SQL");

        s.remove("JDSE");

        s.total();

        s.update("PYTHON","8 Months");

        s.sortid();
        s.display();

        s.sortName();
        s.display();





    }
}
