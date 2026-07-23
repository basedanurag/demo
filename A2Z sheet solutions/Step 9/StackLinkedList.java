class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class StackLinkedList {
        static Node top;
        static  int size = 0;
    public static void push(int x){
        Node temp =  new Node(x);
        temp.next = top;
        top = temp;
        size +=1;
    }
    public static void pop(){
        Node temp = top;
        top = top.next;
        size -=1;
    }
    public static int top(){
        return top.val;
    }
    public static int size(){
        return size;
    }
    public static void main(String[] args) {
        
    }
}
