class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class InsertionLinkedList {
    // converting array to LL

    public static Node convertToList(int[] arr) {
        Node hnode = new Node(arr[0]);
        Node mover = hnode;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return hnode;
    }

    public static Node insertHead(Node hNode, int val) {
        Node temp = new Node(val);
        temp.next = hNode;

        return temp;
    }

    public static Node insertNodeTail(Node head, int val) {
        Node nNode = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nNode;
        nNode.next = null;
        return head;
    }

    // insertion in the kth pos of the List
    public static Node insertAtKth(Node head, int val, int k, int length) {
        if (k == 1)
            return insertHead(head, val);
        if (k == length + 1)
            return insertNodeTail(head, val);
        Node temp = head;
        Node newNode = new Node(val);
        int count = 1;
        while (temp.next != null) {
            if (count == k - 1) {
                Node after = temp.next;
                temp.next = newNode;
                newNode.next = after;
                break;
            }
            count++;
            temp = temp.next;
        }

        return head;
    }
    public static Node insertValue(Node head, int val, int k, int length) {
        if(head == null){
            if(k == 1){
                return new Node(val);
            }else{
                return head;
            }
        }
        if (k == 1)
            return insertHead(head, val);
        if (k == length + 1)
            return insertNodeTail(head, val);
        Node temp = head;
        Node newNode = new Node(val);
        
        while (temp.next != null) {
            if (temp.next.data == k ) {
                Node after = temp.next;
                temp.next = newNode;
                newNode.next = after;
                break;
            }
            
            temp = temp.next;
        }

        return head;
    }

    public static void traversalLL(Node hNode) {
        Node temp = hNode;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static int lengthLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {

            temp = temp.next;
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 5 };
        Node hNode = convertToList(arr);
        traversalLL(hNode);
        hNode = insertHead(hNode, 0);
        System.out.println();
        traversalLL(hNode);
        System.out.println();

        hNode = insertNodeTail(hNode, 6);
        traversalLL(hNode);
        System.out.println();
        int length = lengthLL(hNode);
        hNode = insertAtKth(hNode, 4, 3, length);
        traversalLL(hNode);
        System.out.println();
        insertValue(hNode, 9, 5, length);
        traversalLL(hNode);
    }
}