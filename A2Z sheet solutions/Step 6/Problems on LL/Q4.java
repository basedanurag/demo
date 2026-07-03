



public class Q4 {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast ){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        Solution solution = q4.new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        head.next.next.next = head.next;
        ListNode result = solution.detectCycle(head);
        System.out.println(result != null ? result.val : -1);
    }
}
