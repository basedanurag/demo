
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9 {
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;

            } else {
                temp.next = list2;
                list2 = list2.next;

            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummy.next;
    }

    public static ListNode sortLinkedList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        ListNode lefthead = head;
        ListNode righthead = slow.next;
        middle.next = null;

        lefthead = sortLinkedList(lefthead);
        righthead = sortLinkedList(righthead);

        return merge(lefthead, righthead);
    }

    public static ListNode sortList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
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

    public static void traversal(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(1);
        head = sortLinkedList(head);
        traversal(head);
    }
}