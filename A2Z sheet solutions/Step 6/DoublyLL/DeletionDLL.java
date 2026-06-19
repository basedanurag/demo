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
public class DeletionDLL {
    public static Node deleteNodeHead(Node head){
        if(head == null) return null;

         head = head.next;
         head.prev = null;

         return head;

    }
    public static Node deleteLastNode(Node head){
        if(head == null) return null;
        Node temp = head;
        while (temp.next != null) { 
            temp = temp.next;
        }
            Node previous = temp.prev;
            temp.prev = null;
            previous.next = null;
        
        

        return head;
    }
    public static Node deletionKthvalue(Node head,int k){
        
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
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node head = arrayToDLL(arr);
        traversal(head);
        head = deleteNodeHead(head);
        System.out.println();
        traversal(head);
        System.out.println();
        head = deleteLastNode(head);
        traversal(head);
    }
}
