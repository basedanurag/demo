
package Problems;


public class Q8{
    // BRUTE FORCE SOLUTIONS 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0 ; i < n; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        
        while(fast.next != null ){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next =  slow.next.next;

        return head;
    }
    public static void main(String[] args) {
        Q8 solution = new Q8();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = solution.removeNthFromEnd(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}