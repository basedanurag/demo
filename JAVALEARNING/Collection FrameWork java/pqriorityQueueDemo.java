import java.util.*;
/*for max heap use comparator  */
class MyComp  implements Comparator<Integer>{
  public int compare(Integer a, Integer b){
    if (a < b) return 1;
    if (a > b) return -1;
    return 0;
  }

}
public class pqriorityQueueDemo {
  
    public static void main(String[] args) {
        // this is called as min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp()); // for max heap  
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // for min heap
          pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        pq.forEach(x -> System.out.print(x+" "));
    }
}
