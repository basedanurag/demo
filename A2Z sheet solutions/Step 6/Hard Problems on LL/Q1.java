class ListNode{
    int val;
    ListNode  next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class Q1 {
    public static ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode currNode;
        ListNode prev = null;
        while (temp != null) {
            currNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = currNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        
    }
}