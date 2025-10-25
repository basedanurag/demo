import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1,"a", 2, "b"));
        tm.put(8,"JUDenfwbfhjw");
        tm.put(3,"c");
        tm.put(3,"c");
        System.out.println(tm.ceilingEntry(8));
        System.out.println(tm);


    }
}
