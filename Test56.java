import java.util.*;

public class Test56 {
    public static void main(String[] args){

        HashSet<String> removeDuplicate = new HashSet<>();

        removeDuplicate.add("Allen");
        removeDuplicate.add("Joan");
        removeDuplicate.add("Harvey");
        removeDuplicate.add("Harrish");

        System.out.println("HashSet: " + removeDuplicate);

        ArrayList<String> fromHashSet = new ArrayList<>(removeDuplicate);

        System.out.println("ArrayList: " + fromHashSet);
    }
}