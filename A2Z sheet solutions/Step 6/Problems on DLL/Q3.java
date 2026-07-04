class ListNode {
    int val = 0;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Q3 {
    public static ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
       while (temp != null && temp.next != null) {
            ListNode nextNode = temp.next;
            while (nextNode != null && nextNode.val == temp.val) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode != null) nextNode.prev  = temp;
            
            temp = temp.next;
       }
       return head;
    }

    static ListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            node.prev = temp;
            temp = node;
        }

        return head;
    }

    static boolean isEqual(ListNode head, int[] expected) {

        int i = 0;

        while (head != null && i < expected.length) {
            if (head.val != expected[i])
                return false;

            head = head.next;
            i++;
        }

        return head == null && i == expected.length;
    }

    static void printList(ListNode head) {

        if (head == null) {
            System.out.println("[]");
            return;
        }

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }

    static void runTest(int testNo, int[] input, int[] expected) {

        ListNode head = createList(input);

        ListNode result = removeDuplicates(head);

        if (isEqual(result, expected)) {
            System.out.println("✅ Test Case " + testNo + " PASSED");
        } else {

            System.out.println("❌ Test Case " + testNo + " FAILED");

            System.out.print("Expected : ");
            printList(createList(expected));

            System.out.print("Got      : ");
            printList(result);
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        runTest(1,
                new int[] { 1, 1, 1, 2, 2, 3, 3, 4 },
                new int[] { 1, 2, 3, 4 });

        runTest(2,
                new int[] { 1, 1, 2, 3, 3 },
                new int[] { 1, 2, 3 });

        runTest(3,
                new int[] { 1, 2, 3, 4 },
                new int[] { 1, 2, 3, 4 });

        runTest(4,
                new int[] { 1, 1, 1, 1 },
                new int[] { 1 });

        runTest(5,
                new int[] { 5, 5, 6, 7, 7, 8, 9, 9 },
                new int[] { 5, 6, 7, 8, 9 });

        runTest(6,
                new int[] { 10 },
                new int[] { 10 });

        runTest(7,
                new int[] { 2, 2 },
                new int[] { 2 });

        runTest(8,
                new int[] { 1, 2, 2, 2, 3, 4, 4, 5 },
                new int[] { 1, 2, 3, 4, 5 });

        runTest(9,
                new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 },
                new int[] { 1, 2, 3, 4, 5 });

        runTest(10,
                new int[] { 1, 2, 2, 3, 4, 5, 5 },
                new int[] { 1, 2, 3, 4, 5 });
    }
}
