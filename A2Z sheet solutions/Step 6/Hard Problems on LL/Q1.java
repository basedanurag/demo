class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Q1 {
    public static ListNode reverse(ListNode head) {
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

    public static ListNode getKthListNode(ListNode head, int k) {
        ListNode temp = head;

        while (temp != null && k > 0) {
            k--;
            temp = temp.next;

        }
        return temp;
    }

    public static ListNode reversingKthGroupNode(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode kthNode = head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode = temp;
        while (temp != null) {
            kthNode = getKthListNode(temp, k);
            if (kthNode == null) {
                if (prev != null)
                    prev.next = temp;

                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                prev.next = kthNode;
            }

            prev = temp;
            temp = nextNode;

        }

        return head;
    }

    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" ");
            head = head.next;
        }
        return sb.toString().trim();
    }

    public static void runTest(int testNo, int[] input, int k, String expected) {
        ListNode head = createList(input);

        String output = listToString(reversingKthGroupNode(head, k));

        System.out.println("========== Test Case " + testNo + " ==========");
        System.out.println("Input    : " + java.util.Arrays.toString(input));
        System.out.println("k        : " + k);
        System.out.println("Expected : " + expected);
        System.out.println("Output   : " + output);

        if (expected.equals(output)) {
            System.out.println("Result   : ✅ PASS");
        } else {
            System.out.println("Result   : ❌ FAIL");
        }

        System.out.println();
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void runTest(int testNo, int[] arr, int k) {
        System.out.println("========== Test Case " + testNo + " ==========");
        System.out.print("Input: ");

        if (arr.length == 0) {
            System.out.print("[]");
        } else {
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }

        System.out.println("\nk = " + k);

        ListNode head = createList(arr);

        System.out.print("Output: ");
        head = reversingKthGroupNode(head, k);
        printList(head);

        System.out.println();
    }

    public static void main(String[] args) {

        runTest(1, new int[] {}, 2, "");

        runTest(2, new int[] { 1 }, 1, "1");

        runTest(3, new int[] { 1 }, 2, "1");

        runTest(4, new int[] { 1, 2 }, 2, "2 1");

        runTest(5, new int[] { 1, 2, 3 }, 2, "2 1 3");

        runTest(6, new int[] { 1, 2, 3, 4 }, 2, "2 1 4 3");

        runTest(7, new int[] { 1, 2, 3, 4, 5 }, 2, "2 1 4 3 5");

        runTest(8, new int[] { 1, 2, 3, 4, 5, 6 }, 3, "3 2 1 6 5 4");

        runTest(9, new int[] { 1, 2, 3, 4, 5 }, 3, "3 2 1 4 5");

        runTest(10, new int[] { 1, 2, 3, 4, 5 }, 5, "5 4 3 2 1");

        runTest(11, new int[] { 1, 2, 3, 4, 5 }, 6, "1 2 3 4 5");

        runTest(12, new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }, 4,
                "40 30 20 10 80 70 60 50");

        runTest(13, new int[] { 5, 5, 5, 5 }, 2, "5 5 5 5");

        runTest(14, new int[] { -1, -2, -3, -4 }, 2, "-2 -1 -4 -3");

        runTest(15, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4,
                "4 3 2 1 8 7 6 5 9");

        runTest(16, new int[] { 1, 2, 3, 4, 5, 6, 7 }, 7,
                "7 6 5 4 3 2 1");

        runTest(17, new int[] { 1, 2, 3, 4, 5, 6, 7 }, 8,
                "1 2 3 4 5 6 7");

        runTest(18, new int[] { 100, 200, 300, 400 }, 3,
                "300 200 100 400");

        runTest(19, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 5,
                "5 4 3 2 1 6 7 8");
    }
}