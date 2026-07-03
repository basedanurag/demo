public class Q10 {
    public static ListNode sortZeroOneOptimal(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode dummZero = new ListNode(-1);
        ListNode dummyOne =  new ListNode(-1);
        ListNode dummyTwo  = new ListNode(-1);
        ListNode temp = head;
        ListNode zero = dummZero;
        ListNode one = dummyOne;
        ListNode two =  dummyTwo;
        while (temp !=  null) {
            if(temp.val == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.val == 1){
                one.next =  temp;
                one =  one.next;

            }
            else{
                two.next =  temp;
                two =  two.next;
            }
            temp = temp.next;
        }

        zero.next =  (dummyOne.next) != null ?  dummyOne.next : dummyTwo.next;
        one.next = dummyTwo.next;
        two.next = null;

        return dummZero.next;
    }
    public static ListNode sortZeroOne(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int count0 = 0;
        int count1 = 0;
        
        while (temp != null) {
            if(temp.val == 0) count0++;
            else if(temp.val == 1)count1++;
            

            temp = temp.next;
        }
        temp =  head;
        while (temp != null) {
            if(count0 > 0){
                temp.val =  0;
                count0--;
            }
            else if(count1 > 0){
                temp.val = 1;
                count1--;
            }
            else{
                temp.val =  2;
               
            }
            temp= temp.next;
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
         ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head = sortZeroOneOptimal(head);
        traversal(head);
    }
    
}