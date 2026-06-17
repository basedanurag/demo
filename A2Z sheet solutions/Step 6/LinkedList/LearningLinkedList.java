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

public class LearningLinkedList  {
    // conversion of array to LL
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
    public static int leangthOfLL(Node hNode){
        int count = 0;
        Node temp = hNode; 
        // traversal done 
        while (temp != null) {
            
            temp = temp.nexNode;
            count++;

        }
        return count;
    }
    public static void traversal(Node hNode){
         Node temp = hNode; 
        // traversal done 
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nexNode;

        }
    }
    public static int searchLL(Node hNode, int val){
        Node tNode = hNode;
        while (tNode != null) {
            if(tNode.data == val) return 1;
            tNode = tNode.nexNode;

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        Node hNode = convertToLL(arr);
        traversal(hNode);
        System.out.println();
        int lengthofLL = leangthOfLL(hNode);
        System.out.println(lengthofLL);
        System.out.println(searchLL(hNode, 3));
        System.out.println(searchLL(hNode, 9));
       
        
        
    }
    
}