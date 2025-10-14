import java.util.HashMap;



public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1,"hello");
        mp.put(2, "kaise ho bhai");
        mp.put(3, "bye");
        

        mp.forEach((k,v) -> System.out.println(k+ " " + v) );
    }
}
