import java.util.*;

class boy {
    String name;
    int mark;

    boy(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " : " + mark;
    }
}

class boy1 implements Comparator<boy> {

    @Override
    public int compare(boy s1, boy s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Test83 {
    public static void main(String[] args) {

        ArrayList<boy> store = new ArrayList<>();

        store.add(new boy("Allen", 50));
        store.add(new boy("Joan", 70));
        store.add(new boy("Harrish", 80));
        store.add(new boy("Harvey", 90));

        Comparator<boy> asc = new boy1();

        Collections.sort(store, asc);
        System.out.println("Ascending : " + store);

        Collections.sort(store, Collections.reverseOrder(asc));
        System.out.println("Descending : " + store);
    }
}