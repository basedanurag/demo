class Node{
    int data;
    Node next;
    Node(int data){
        this.data =  data;
        next = null;
    }
    Node(int data, Node next){
        this.data =  data;
        this.next = next;
    }
}
public class InsertionLinkedList{
    // converting array to LL

    public static Node convertToList(int[] arr){
        Node hnode = new Node(arr[0]);
        Node mover = hnode;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return hnode;
    }
    public static Node insertHead(Node hNode, int val){
        Node temp =  new Node(val);
        temp.next = hNode;

        return temp;
    }
    public static Node insertNodeTail(Node head , int val){
        Node nNode =  new Node(val);
        Node temp =  head;
        while (temp.next != null) {
        temp = temp.next;
        }
        temp.next = nNode;
        nNode.next = null;
        return head;
    }
    
    public static void traversalLL(Node hNode){
        Node temp = hNode;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node hNode = convertToList(arr);
        traversalLL(hNode);
        hNode = insertHead(hNode, 0);
        System.out.println();
        traversalLL(hNode);
        System.out.println();

        insertNodeTail(hNode, 6);
        traversalLL(hNode);


    }
}