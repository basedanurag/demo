import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,90,60)); // as this implements sortedSet interface then all the elements will be sorted inside this 
        ts.add(10); // as this is a set so it donot have repeated values in it only uniqe elements are stored 
        ts.forEach(x ->  System.out.println(x));
        System.out.println(ts.ceiling(19));// if the entered number is not present then  this method gives the greater closest number than element inside the treeSet;
        
    }
}
