public class Q2 {
    public static int  findLength(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        
        int len  =  findLength(head);
        if(k % len == 0){
            return head;
        } 
        int endPoint  = k % len;
        for(int i = 0; i < endPoint; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next =  null;

        return head;
    }
    public static void main(String[] args) {
        System.out.println(5 % 5);
    }
}
