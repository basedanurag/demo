package Problems;



public class Q6 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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
    public ListNode middle (ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=  null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp =  head;
       ListNode mid=  middle(head);
       ListNode rev = reverseList(mid);
       while(temp != mid && rev != null){
            if(temp.val != rev.val){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
       } 
       return true;  
    }

    public static void main(String[] args) {
        Q6 solution = new Q6();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println("Palindrome: " + solution.isPalindrome(head));
    }
}
