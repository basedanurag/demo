


public class Q5 {
         public int  detectLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count  = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                fast = fast.next;
                count++;
                while (fast != slow) {
                    count+= 1;
                    fast = fast.next;
                    
                }
                 return count;
              
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Q5 solution = new Q5();
        int passedTests = 0;
        int totalTests = 5;

        // Test Case 1: Linked list with cycle at end
        System.out.println("Test Case 1: List with cycle");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // cycle back to node2
        int result1 = solution.detectLength(node1);
        int expected1 = 3;
        System.out.println("Result: " + result1 + ", Expected: " + expected1);
        if (result1 == expected1) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 2: Linked list without cycle
        System.out.println("Test Case 2: List without cycle");
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        int result2 = solution.detectLength(n1);
        int expected2 = 0;
        System.out.println("Result: " + result2 + ", Expected: " + expected2);
        if (result2 == expected2) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 3: Single node with self-cycle
        System.out.println("Test Case 3: Single node with self-cycle");
        ListNode single = new ListNode(5);
        single.next = single;
        int result3 = solution.detectLength(single);
        int expected3 = 1;
        System.out.println("Result: " + result3 + ", Expected: " + expected3);
        if (result3 == expected3) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 4: Two nodes with cycle
        System.out.println("Test Case 4: Two nodes with cycle");
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        a.next = b;
        b.next = a;  // cycle back to a
        int result4 = solution.detectLength(a);
        int expected4 = 2;
        System.out.println("Result: " + result4 + ", Expected: " + expected4);
        if (result4 == expected4) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Test Case 5: Larger list with cycle in middle
        System.out.println("Test Case 5: Larger list with cycle");
        ListNode x1 = new ListNode(1);
        ListNode x2 = new ListNode(2);
        ListNode x3 = new ListNode(3);
        ListNode x4 = new ListNode(4);
        ListNode x5 = new ListNode(5);
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x3;  // cycle back to x3
        int result5 = solution.detectLength(x1);
        int expected5 = 3;
        System.out.println("Result: " + result5 + ", Expected: " + expected5);
        if (result5 == expected5) {
            System.out.println("✓ PASSED\n");
            passedTests++;
        } else {
            System.out.println("✗ FAILED\n");
        }

        // Print summary
        System.out.println("========================================");
        System.out.println("Test Results: " + passedTests + "/" + totalTests + " tests passed");
        System.out.println("========================================");
    }
}
