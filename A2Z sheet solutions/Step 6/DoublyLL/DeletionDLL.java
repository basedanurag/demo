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
        if(head == null){
            return null;

        }
        if(k == 1) return null;

        Node temp =  head;
        int count = 1;
        while (temp.next != null) {
            if(count == k -1 ){
                Node previous = temp.prev;
                Node front = temp.next;
                previous.next = front;
                front.prev = previous;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
    public static void deleteNode(Node node){
        Node prev = node.prev;
        Node front  = node.next;
        prev.next = front;
        front.prev = prev;

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
        // head = deleteNodeHead(head);
        // System.out.println();
        // traversal(head);
        // System.out.println();
        // head = deleteLastNode(head);
        // traversal(head);
        head = deletionKthvalue(head, 4);
        traversal(head);
        deleteNode(head.next.next);
       
        traversal(head);
    }
}
