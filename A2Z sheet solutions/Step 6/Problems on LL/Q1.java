package Problems ;



public class Q1 {
    public static ListNode convertToLL(int[] arr){
        ListNode heaNode = new ListNode(arr[0]);
        ListNode mover =  heaNode;
        for (int i = 1; i < arr.length; i++) {
            ListNode tNode = new ListNode(arr[i]);
            mover.next = tNode;
            mover = tNode;
        }
        return heaNode;
    }
    public static int leangthOfLL(ListNode hNode){
        int count = 0;
        ListNode temp = hNode; 
        // traversal done 
        while (temp != null) {
            
            temp = temp.next;
            count++;

        }
        return count;
    }
    public static void traversal(ListNode head){
        ListNode temp =  head;
        while (temp != null) {
            System.out.print(temp.val);
        }
        System.out.println();
    }
    public static ListNode middleNode(ListNode head) {
        if(head == null) return null;
        int count  = 0;
        ListNode temp = head;
        int length = leangthOfLL(head);
        int mid = (length/2) + 1;
        while(temp != null){
            count++;
            if(mid == count){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        ListNode head = convertToLL(new int[]{1, 2, 3, 4, 5});
        traversal(head);
        ListNode mid = middleNode(head);
        System.out.println("Middle node value: " + mid.val);
    }

}
