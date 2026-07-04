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

public class Q1 {
    public static ListNode removeTarget(ListNode head, int target) {
        ListNode temp = head;

        while (temp != null) {

            if (temp.val == target) {
                if (temp == head) {
                    head = head.next;
                }
                ListNode nextNode = temp.next;
                // ListNode prev = null;

                if (temp.val == target) {
                    if (temp.prev != null) {

                        temp.prev.next = temp.next;

                    }

                    if (temp.next != null) {
                        nextNode.prev = temp.prev;
                    }
                }

            }
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
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
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
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    static void runTest(int testNo, int[] input, int target, int[] expected) {

        ListNode head = createList(input);

        ListNode result = removeTarget(head, target);

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
                new int[] { 1, 2, 3, 4, 5 },
                3,
                new int[] { 1, 2, 4, 5 });

        runTest(2,
                new int[] { 5, 5, 5, 5 },
                5,
                new int[] {});

        runTest(3,
                new int[] { 10, 20, 30, 40 },
                20,
                new int[] { 10, 30, 40 });

        runTest(4,
                new int[] { 7, 8, 9 },
                100,
                new int[] { 7, 8, 9 });

        runTest(5,
                new int[] { 1 },
                1,
                new int[] {});

        runTest(6,
                new int[] { 2, 4, 6, 8, 10 },
                10,
                new int[] { 2, 4, 6, 8 });

        runTest(7,
                new int[] { 9, 1, 9, 2, 9, 3 },
                9,
                new int[] { 1, 2, 3 });

        runTest(8,
                new int[] { 11, 22, 33, 44, 55 },
                44,
                new int[] { 11, 22, 33, 55 });
    }
}