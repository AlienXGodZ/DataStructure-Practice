import java.util.*;

class reverseOrdere {
    String name;
    int mark;

    reverseOrdere(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return name + " : " + mark;
    }
}

class reversee implements Comparator<reverseOrdere> {

    public int compare(reverseOrdere s1, reverseOrdere s2) {
        return s1.name.compareTo(s2.name);
    }

}


public class Test82 {
    public static void main(String[] args) {

        ArrayList<reverseOrdere> store = new ArrayList<>();

        store.add(new reverseOrdere("Allen", 50));
        store.add(new reverseOrdere("Joan", 70));
        store.add(new reverseOrdere("Harrish", 80));
        store.add(new reverseOrdere("Harvey", 90));

        Collections.sort(store, new reversee());

        System.out.println(store);

        Collections.reverse(store);
        System.out.println(store);


    }
}

