import java.util.Arrays;
import java.util.Comparator;
class My implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2)
        return 1;
        if(o1 > o2)
        return -1;

        return 0;
    }
    
}
public class ArraysAndComparatorDemo {

    public static void main(String[] args) {
        //int[] a=  {2,3,4,5,6,1,5,9};
        Integer[] b=  {2,3,4,5,6,1,5,9};
        // int c[] = Arrays.copyOf(b,b.length);

        Arrays.sort(b, new My());
        for(Integer x: b)
        System.out.println(x);
    }
}
