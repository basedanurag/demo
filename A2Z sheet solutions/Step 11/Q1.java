import java.util.PriorityQueue;

public class Q1 {
    // kth largest element using heaps
    public int findKthLargest(int[] nums, int k) {
        int n  = nums.length;
        PriorityQueue<Integer> minheap =  new PriorityQueue<>();
        for(int i = 0;i < n ; i++){
            minheap.offer(nums[i]);
            if(minheap.size() > k){
                minheap.poll();
            }

        }
        return minheap.poll();
    }
}
