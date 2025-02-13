import java.util.PriorityQueue;

public class Q3066 {
   
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        //adding all element in pq
        for(int num : nums){
            pq.add((long)num);

        }
        int count =0;
        while(!pq.isEmpty()&& pq.peek()<k){
            long x = pq.poll();
            long y = pq.poll();
            pq.add(x * 2 + y ); //push the value back to the pq
            count ++;
        }
        return count ;

    }
}
