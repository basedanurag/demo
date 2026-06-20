class Node {
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
    Node(int data, Node next, Node prevNode){
        this.data = data;
        this.next = next;
        this.prev = prevNode ;
    }
}
public class InsertionDLL {
    //inserting at the head of the DLL
    public static Node insertHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        temp.prev = null;

        return temp;

    }
    public static Node insertatTail(Node head, int val){
        if(head == null) return null;
        Node temp = new Node(val);
        Node mover = head;
        while (mover.next!= null) {
            mover= mover.next;
        }
        mover.next = temp;
        mover = temp;
        return head;
    }
    public static Node insertionAtKth(Node head, int val, int k){
        if(head == null){
            if(k == 1){
                return insertHead(head, val);
            }
            else return null;
        }
        Node newNode = new Node(val);
        Node temp =  head;
        int count = 1;
        while(temp != null){
            if(count == k - 1){
                Node front  = temp.next;
                Node prev = temp;

                temp.next = newNode;
                newNode.prev = prev;
                newNode.next = front;
                front.prev = newNode;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
    public static void insertNode(Node temp, int val){
        Node prev =  temp.prev;
        Node newNode = new  Node(val,temp,prev);
        prev.next = newNode;
        temp.prev = newNode;
    }
     public static Node arrayToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node back =  head;
        
        for (int i = 1; i < arr.length; i++) {
            Node temp =  new Node(arr[i], null, back);
            back.next = temp;
            back = temp;
        }
        return head;
    }
    //traversal
    public static void traversal(Node head){
        Node temp =  head;
        while (temp != null) { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node head = arrayToDLL(arr);
         traversal(head);
         head = insertHead(head, 0);
         traversal(head);
         head = insertatTail(head, 6);
         traversal(head);
         head = insertionAtKth(head, 100, 3);
         traversal(head);
         insertNode(head.next.next, 5);
         traversal(head);
    }
}
