import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }
}
public class Q7{
    // BRUTE FORCE SOLUTIONS 
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        if( head.next == null) return head;
        List<Integer> data = new ArrayList<>();
        ListNode temp =  head;
        // for the odd one out there 
        while(temp != null && temp.next !=  null){
            data.add(temp.val);
            temp = temp.next.next;
        }

        if(temp != null) data.add(temp.val);

        temp = head.next;

        // even 
        while(temp != null && temp.next != null){
            data.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null) data.add(temp.val);
        int i = 0;
        temp = head;
        while(i < data.size() && temp != null){
            temp.val = data.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
    public static ListNode oddEven(ListNode head) {
        if(head == null) return null;
        if( head.next == null) return head;
       
        ListNode odd = head; ListNode even = head.next; 
        ListNode evenHead = head.next;

        while(even!= null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;

        }
        odd.next = evenHead;
        

        return head;
    }
    public static void main(String[] args) {
        
    }
}