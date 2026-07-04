
import java.util.ArrayList;
import java.util.List;

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

public class Q2 {
    public static List<List<Integer>> findAllPairsTwoPointer(ListNode head, int target) {
       
        List<List<Integer>> pairs = new ArrayList<>();
         if(head == null) return pairs;
        ListNode left = head;
        ListNode right = head;
        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null) {
                right = temp;
            }
            temp = temp.next;
        }
        while (left != right && left.prev != right) {
            if (left.val + right.val == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(left.val);
                pair.add(right.val);
                pairs.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if (left.val + right.val > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        return pairs;
    }

    public static List<List<Integer>> findAllPairs(ListNode head, int target) {
        List<List<Integer>> pairs = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            ListNode temp2 = temp.next;
            while (temp2 != null) {

                if (temp.val + temp2.val == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(temp.val);
                    pair.add(temp2.val);
                    pairs.add(pair);
                    
                }
                if (temp.val + temp2.val > target) {
                    break;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return pairs;
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

    static boolean isEqual(List<List<Integer>> actual, int[][] expected) {

        if (actual.size() != expected.length)
            return false;

        for (int i = 0; i < expected.length; i++) {

            if (actual.get(i).size() != 2)
                return false;

            if (actual.get(i).get(0) != expected[i][0])
                return false;

            if (actual.get(i).get(1) != expected[i][1])
                return false;
        }

        return true;
    }

    static void printPairs(List<List<Integer>> pairs) {

        if (pairs.isEmpty()) {
            System.out.println("[]");
            return;
        }

        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    static void printExpected(int[][] expected) {

        if (expected.length == 0) {
            System.out.println("[]");
            return;
        }

        for (int[] pair : expected) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }

    static void runTest(int testNo, int[] input, int target, int[][] expected) {

        ListNode head = createList(input);

        List<List<Integer>> result = findAllPairsTwoPointer(head, target);

        if (isEqual(result, expected)) {
            System.out.println("✅ Test Case " + testNo + " PASSED");
        } else {
            System.out.println("❌ Test Case " + testNo + " FAILED");

            System.out.println("Input    : " + java.util.Arrays.toString(input));
            System.out.println("Target   : " + target);

            System.out.println("Expected:");
            printExpected(expected);

            System.out.println("Got:");
            printPairs(result);
        }

        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        runTest(1,
                new int[] { 1, 2, 3, 4, 5 },
                5,
                new int[][] {
                        { 1, 4 },
                        { 2, 3 }
                });

        runTest(2,
                new int[] { 1, 2, 3, 4, 5 },
                3,
                new int[][] {
                        { 1, 2 }
                });

        runTest(3,
                new int[] { 5, 6, 7, 8 },
                13,
                new int[][] {
                        { 5, 8 },
                        { 6, 7 }
                });

        runTest(4,
                new int[] { 10, 20, 30, 40 },
                100,
                new int[][] {});

        // Sorted version of previous testcase
        runTest(5,
                new int[] { 2, 5, 5, 8 },
                10,
                new int[][] {
                        { 2, 8 },
                        { 5, 5 }
                });

        runTest(6,
                new int[] { 1, 9 },
                10,
                new int[][] {
                        { 1, 9 }
                });

        runTest(7,
                new int[] { 4 },
                8,
                new int[][] {});

        // Two-pointer returns unique pairs
        runTest(8,
                new int[] { 3, 3, 3, 3 },
                6,
                new int[][] {
                        { 3, 3 },
                        {3, 3}
                });

        runTest(9,
                new int[] { 1, 2, 3, 4, 5, 6 },
                7,
                new int[][] {
                        { 1, 6 },
                        { 2, 5 },
                        { 3, 4 }
                });

        runTest(10,
                new int[] { 1, 3, 4, 5, 7, 8, 9 },
                12,
                new int[][] {
                        { 3, 9 },
                        { 4, 8 },
                        { 5, 7 }
                });
    }
}
