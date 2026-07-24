class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class StackLinkedList {

    static Node top;
    static int size = 0;

    public static void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        top = top.next;
        size--;
    }

    public static int peek() {
        if (top == null)
            throw new RuntimeException("Stack is empty");

        return top.val;
    }

    public static void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        push(5);
        push(2);
        push(4);
        push(1);
        push(6);

        display();      // 6 1 4 2 5

        pop();

        display();      // 1 4 2 5

        System.out.println(peek()); // 1
        System.out.println(size);   // 4
    }
}