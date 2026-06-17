class Node{
    int data;
    Node nexNode;

    Node(int data, Node nextNode){
        this.data = data;
        this.nexNode = nextNode;
    }
    Node(int data){
        this.data = data;
        nexNode = null;
    }
}
public class DeleteHeadLL {
    public static Node deletHeadNode(Node lNode){
        Node tNode = lNode;
        lNode = lNode.nexNode;
        return lNode;
    }
    public static Node convertToLL(int[] arr){
        Node heaNode = new Node(arr[0]);
        Node mover =  heaNode;
        for (int i = 1; i < arr.length; i++) {
            Node tNode = new Node(arr[i]);
            mover.nexNode = tNode;
            mover = tNode;
        }
        return heaNode;
    }
    public static void traversal(Node hNode){
         Node temp = hNode;  // no need to worry because of garbage collector in java 
        // traversal done 
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nexNode;

        }
    }

    public static void deleteNode(Node lNode){
        
    }
    public static void main(String[] args) {
         int arr [] = {1,2,3,4,5,6};

        Node hNode = convertToLL(arr);
        traversal(hNode);
        System.out.println();
        hNode = deletHeadNode(hNode);
        System.out.println();
        traversal(hNode);

    }
}
