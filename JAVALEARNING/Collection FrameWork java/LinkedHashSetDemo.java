import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        ArrayList <Integer> als = new ArrayList<>(List.of(1,2,3,4,5,6,6,7,8,9,10));
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(6);
        hs.addAll(als);
        hs.forEach(x -> System.out.println(x));

    }
}
