import java.util.LinkedHashMap;

public class LinkedHMCacheDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmp =  new LinkedHashMap<>(5, .75f);
        lmp.put(1,"Anurag");
        lmp.put(2,"Nishant");
        lmp.put(3,"neelam" );
        lmp.put(4,"Anurag");
        // lmp.put(1,"Anjali"); // it will change the previous value and store the new value in this key bucket

        lmp.forEach((k,v) -> System.out.println(k + " "+ v));
    }
}
