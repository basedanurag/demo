public class Q1290 {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    class Solution {
        public int getDecimalValue(ListNode head) {
            int result = head.val;
            while (head.next != null) {
                result = (result << 1) | head.next.val;
                head = head.next;
            }
            return result;
        }
    }
}
