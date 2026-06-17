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
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        Node hNode = convertToLL(arr);
        Node temp = hNode; 
        // traversal done 
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nexNode;

        }
        
        
    }
    
}