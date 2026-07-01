import java.util.*;

public class Test57 {
    public static void main(String[] args){

        ArrayList<String> removeDuplicate = new ArrayList<>();

        removeDuplicate.add("Allen");
        removeDuplicate.add("Joan");
        removeDuplicate.add("Harvey");
        removeDuplicate.add("Harrish");

        System.out.println(removeDuplicate);

        HashSet<String> fromHashSet = new HashSet<>(removeDuplicate);

        System.out.println(fromHashSet);
    }
}