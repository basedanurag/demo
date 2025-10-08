import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        System.out.println(hs);
        System.out.println(
            hs.contains(60) // this method searches the objects in the hashSet
        );
        
    }
}
