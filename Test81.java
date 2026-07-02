import java.util.*;

class Reverse implements Comparable<Reverse>{

    String name;
    String model;

    Reverse(String name, String model){
        this.name = name;
        this.model = model;
    }

    public int compareTo(Reverse others){
        return this.model.compareTo(others.model);
    }

    public String toString() {

        return name + " : " + model;
    }

}
public class Test81 {
    public static void main(String[] args){

        ArrayList<Reverse> store = new ArrayList<>();

        store.add(new Reverse("BMW","1st Model"));
        store.add(new Reverse("Audio","A4 Model"));
        store.add(new Reverse("Tata","No damage"));

        Collections.reverse(store);

        System.out.println(store);



    }
}
