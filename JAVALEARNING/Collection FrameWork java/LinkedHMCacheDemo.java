import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMCacheDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmp =  new LinkedHashMap<>(5, .75f,true);
        
        lmp.put(1,"Anurag");
        lmp.put(2,"Nishant");
        lmp.put(3,"neelam" );
        lmp.put(4,"Anurag");
        lmp.put(6, "Aparna");
        lmp.put(5,"kavishek");
        lmp.put(7, "jigyashu");
        lmp.put(8, "utkarsh");
        // lmp.put(1,"Ansh"); // it will change the previous value and store the new value in this key bucket

        lmp.forEach((k,v) -> System.out.println(k + " "+ v));
    }
}
