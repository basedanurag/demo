class ListNode{
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class QueueLinkedList {
    static ListNode top;
    static ListNode start , end  = null;
    static int size = 0;
    public static void push(int z){
        ListNode temp =  new ListNode(z);
        if(start == null ){
            start = end = temp;
        }
        else{
        end.next= temp;
        end =  temp;
        }

        size ++;
    }
    public static void pop(){
        if(start == null){
            return;
        }
        start =  start.next;
        size -=1;
    }
    public static void peek(){
        if(start == null) return ;

       System.out.println(start.val +" ");
    }
    static int size(){
        return size;
    }

    public static void main(String[] args) {
        push(7);
        push(2);
        push(9);
        peek();

        pop();
        peek();
    }
   
}
