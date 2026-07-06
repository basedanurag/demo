import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.child = null;
    }
}

public class Q3 {
    public static ListNode convert(List<Integer> arr) {
        if (arr.size() == 0)
            return null;
        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;
        for (int i = 1; i < arr.size(); i++) {
            ListNode newNode = new ListNode(arr.get(i));
            temp.child = newNode;
            temp = temp.child;
        }
        return head;
    }

    // flattening of LL
    public static ListNode flatteningLL(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        ListNode t2 = temp;
        while (temp != null) {
            t2 = temp;
            while (t2 != null) {
                arr.add(t2.val);
                t2 = t2.child;
            }
            temp = temp.next;
        }
        Collections.sort(arr);
        head = convert(arr);

        return head;
    }

    public static void printChildList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // ------------------- Test Case 1 -------------------
        // 5 -> 10 -> 19 -> 28
        // | | | |
        // 7 20 22 35
        // | | |
        // 8 50 40
        // | |
        // 30 45

        ListNode head1 = new ListNode(5);
        head1.child = new ListNode(7);
        head1.child.child = new ListNode(8);
        head1.child.child.child = new ListNode(30);

        ListNode head2 = new ListNode(10);
        head2.child = new ListNode(20);

        ListNode head3 = new ListNode(19);
        head3.child = new ListNode(22);
        head3.child.child = new ListNode(50);

        ListNode head4 = new ListNode(28);
        head4.child = new ListNode(35);
        head4.child.child = new ListNode(40);
        head4.child.child.child = new ListNode(45);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        System.out.println("Test Case 1");
        printChildList(flatteningLL(head1));
        System.out.println("Expected:");
        System.out.println("5 7 8 10 19 20 22 28 30 35 40 45 50\n");

        // ------------------- Test Case 2 -------------------

        ListNode a = new ListNode(1);
        a.child = new ListNode(3);
        a.child.child = new ListNode(5);

        ListNode b = new ListNode(2);
        b.child = new ListNode(4);
        b.child.child = new ListNode(6);

        a.next = b;

        System.out.println("Test Case 2");
        printChildList(flatteningLL(a));
        System.out.println("Expected:");
        System.out.println("1 2 3 4 5 6\n");

        // ------------------- Test Case 3 -------------------

        ListNode c = new ListNode(10);

        System.out.println("Test Case 3");
        printChildList(flatteningLL(c));
        System.out.println("Expected:");
        System.out.println("10\n");

        // ------------------- Test Case 4 -------------------

        ListNode d = new ListNode(9);
        d.child = new ListNode(12);

        ListNode e = new ListNode(1);
        e.child = new ListNode(7);

        d.next = e;

        System.out.println("Test Case 4");
        printChildList(flatteningLL(d));
        System.out.println("Expected:");
        System.out.println("1 7 9 12\n");

        // ------------------- Test Case 5 -------------------

        ListNode f = new ListNode(100);
        f.child = new ListNode(200);
        f.child.child = new ListNode(300);

        System.out.println("Test Case 5");
        printChildList(flatteningLL(f));
        System.out.println("Expected:");
        System.out.println("100 200 300\n");

        // ------------------- Test Case 6 -------------------

        ListNode g = new ListNode(4);

        ListNode h = new ListNode(2);

        ListNode i = new ListNode(8);

        ListNode j = new ListNode(1);

        g.next = h;
        h.next = i;
        i.next = j;

        System.out.println("Test Case 6");
        printChildList(flatteningLL(g));
        System.out.println("Expected:");
        System.out.println("1 2 4 8\n");
    }
}
