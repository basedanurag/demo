package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9{
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}