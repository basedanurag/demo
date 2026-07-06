import java.util.*;
class Node{
    int val;
    Node next;
    Node random;
    Node(int val){
        this.val = val;
        this.next= null;
        this.random = null;
    }
}

public class Q4 {
    //better approach without using hashmap
    public static Node copyRandomList(Node head){
        Node dummy = new Node(-1);
        Node temp =  head;
        Node copyNode;
        // connect all the nodes with new nodes
        while (temp != null) {
            copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
           temp = temp.next.next;
        }
        // connect all the random pointers 
        temp = head;
        while(temp != null){
            copyNode = temp.next;

            copyNode.random = (temp.random != null) ? temp.random.next : null;
            temp = temp.next.next; 
        }
        temp = head;
        Node res = dummy;
        while (temp != null) {
            
            copyNode = temp.next;
            res.next= copyNode;
            res = res.next;
            copyNode.next = (copyNode.next != null) ? copyNode.next.next : null;
            temp.next = temp.next.next;

            temp = temp.next;

        }
        return res.next;

    }
    public static Node copyList(Node head){
    Map<Node, Node> mpp = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            mpp.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        Node copyNode = null;
        while (temp !=  null) {
            copyNode = mpp.get(temp);

            copyNode.next = mpp.get(temp.next);
            copyNode.random = mpp.get(temp.random);
            temp = temp.next;
        }
        return mpp.get(head);

    }
    public static void main(String[] args) {
        
    }
}
