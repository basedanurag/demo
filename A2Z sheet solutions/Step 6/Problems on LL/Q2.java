public class Q2 {
  

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev =  null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next =  prev;
            prev = curr;
            curr = nextNode;

        }
        return prev;
    }
}

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        Solution solution = q2.new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = solution.reverseList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
