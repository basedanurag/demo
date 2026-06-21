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
public class ReversingDLL {
    public static Node reverse(Node head){
       
       Node temp =  null;
        Node curr = head;
        while (curr != null) {
             temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if(temp != null){
            head = temp.prev;
        }
        return head;
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
        head = reverse(head);
        traversal(head);
        
    }
}
