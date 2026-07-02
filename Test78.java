import java.util.*;

class cars implements Comparable<cars>{

    String name;
    String model;

    cars(String name, String model){
        this.name = name;
        this.model = model;
    }

    public int compareTo(cars others){
        return this.model.compareTo(others.model);
    }

    public String toString() {

        return name + " : " + model;
    }

}
public class Test78 {
    public static void main(String[] args){

        ArrayList<cars> store = new ArrayList<>();

        store.add(new cars("BMW","1st Model"));
        store.add(new cars("Audio","A4 Model"));
        store.add(new cars("Tata","No damage"));

        Collections.sort(store);

        System.out.println(store);



    }
}
