import java.util.Arrays;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(Arrays.asList(args));
        // hs.add(10);
        // hs.add(20);
        // hs.add(40);
        // hs.add(50);
        // hs.add(10);
        System.out.println(hs);
        hs.forEach((x)-> System.out.print(x + " "));
        // System.out.println(
        //     hs.contains(60) // this method searches the objects in the hashSet
        // );
        
    }
}
