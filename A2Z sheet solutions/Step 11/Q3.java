import java.util.PriorityQueue;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Q3{
     public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a, b) -> a.val - b.val
            );
            // Push the head of each non-null list into the heap
            for (ListNode node : lists) {
                if (node != null)
                    pq.offer(node);
            }

            // Create a dummy node to build the result list
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;

            // While the heap is not empty
            while (!pq.isEmpty()) {
                // Extract the node with the smallest value
                ListNode smallest = pq.poll();

                // Add it to the result list
                tail.next = smallest;
                tail = tail.next;

                // If there's a next node, push it into the heap
                if (smallest.next != null) {
                    pq.add(smallest.next);
                }
            }

            // Return the head of the merged list
            return dummy.next;
        }
        
}