import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);
        BitSet bs2 = new BitSet();
        bs2.set(1);
        bs2.set(3);
        bs2.set(5);
        // bs.and(bs2);
       // bs2.or(bs);
       bs.xor(bs2);
       System.out.println( bs);
       System.out.println(bs2);

        
    }
}
