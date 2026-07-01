import java.util.*;

public class Test58 {
    public static void main(String[] args){

        ArrayList<String> removeDuplicate = new ArrayList<>();

        removeDuplicate.add("Allen");
        removeDuplicate.add("Joan");
        removeDuplicate.add("Harvey");
        removeDuplicate.add("Harrish");

        System.out.println(removeDuplicate);

        LinkedList<String> fromHashSet = new LinkedList<>(removeDuplicate);

        System.out.println(fromHashSet);
    }
}