import java.util.Stack;

public class Q5 {
    public static void insert(Stack<Integer> st, int temp) {
        if (st.isEmpty()) {
            st.add(temp);
            return;
        }

        int top = st.pop();

        insert(st, temp);

        st.push(top);

    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty())
            return ;

        int temp = st.pop();

        reverse(st);
        // waiting for the turn

        insert(st, temp);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 3, 1 };

        Stack<Integer> st = new Stack<>();

        for (int i : arr) {
            st.add(i);
        }

         reverse(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
