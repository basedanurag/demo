public class Q12 {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static ListNode addOne(ListNode head) {
        head = reverseLinkedList(head);
        ListNode temp = head;

        int carry = 1;
        while (temp != null) {
            temp.val = temp.val + carry;
            if (temp.val < 9) {
                carry = 0;
                break;
            } else {
                temp.val = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if (carry == 1) {
            ListNode one = new ListNode(1);
            reverseLinkedList(head);

            one.next = head;
            return one;
        }
        return reverseLinkedList(head);
    }

    public static void traversal(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1: 129 -> 130
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(9);

        System.out.print("Input : ");
        traversal(head1);

        head1 = addOne(head1);

        System.out.print("Output: ");
        traversal(head1);

        System.out.println("----------------------");

        // Test Case 2: 999 -> 1000
        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);

        System.out.print("Input : ");
        traversal(head2);

        head2 = addOne(head2);

        System.out.print("Output: ");
        traversal(head2);

        System.out.println("----------------------");

        // Test Case 3: 456 -> 457
        ListNode head3 = new ListNode(4);
        head3.next = new ListNode(5);
        head3.next.next = new ListNode(6);

        System.out.print("Input : ");
        traversal(head3);

        head3 = addOne(head3);

        System.out.print("Output: ");
        traversal(head3);

        System.out.println("----------------------");

        // Test Case 4: 0 -> 1
        ListNode head4 = new ListNode(0);

        System.out.print("Input : ");
        traversal(head4);

        head4 = addOne(head4);

        System.out.print("Output: ");
        traversal(head4);

        System.out.println("----------------------");

        // Test Case 5: 1999 -> 2000
        ListNode head5 = new ListNode(1);
        head5.next = new ListNode(9);
        head5.next.next = new ListNode(9);
        head5.next.next.next = new ListNode(9);

        System.out.print("Input : ");
        traversal(head5);

        head5 = addOne(head5);

        System.out.print("Output: ");
        traversal(head5);
    }
}
