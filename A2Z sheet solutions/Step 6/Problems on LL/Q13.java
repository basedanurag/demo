public class Q13 {
    public static ListNode addTwoList(ListNode head1, ListNode head2){
         ListNode dummy = new ListNode(-1);
        ListNode current  = dummy;
        int carry  = 0;
        ListNode tempA = head1;
        ListNode tempB  = head2;
        
       while(tempA != null || tempB != null){
        int sum =  carry;
            if(tempA != null) { 
                
                sum += tempA.val;
                tempA = tempA.next;

            }
            if(tempB != null) {
                sum += tempB.val;
                tempB = tempB.next;
            }

            ListNode newNode = new ListNode(sum %10);
            carry   = sum/10;
            current.next = newNode;
            current = newNode;

            
       }
        if(carry > 0){
            ListNode newNode  = new ListNode (carry);
            current.next = newNode;
           
        }
        
        return dummy.next;
    }
     static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num1 = {2, 4, 3}; // represents 342
        int[] num2 = {5, 6, 4}; // represents 465
        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);

       ListNode result =  addTwoList(l1, l2);
        printList(result); // Output: 7 -> 0 -> 8
    }
}
