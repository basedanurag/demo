import java.util.LinkedHashMap;

public class LinkedHashMapdemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lm = new LinkedHashMap<>();
        lm.put(1, "anurag");
        lm.put(2, "nishant");
        lm.put(3, "neelam");
        String s = lm.get(3);
        s = lm.get(2);
        System.out.println(s);
        lm.forEach((k,v)-> System.out.println(k+" "+ v));
    }
}
