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
public class LearningDLL {
    // Array to a Doubly LL
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
    }
}