import java.util.Stack;

public class Q4 {
    public static void insert(Stack<Integer> st,int temp){
        if(st.isEmpty() || st.peek() <= temp){
            st.add(temp);
            return;
        }

        int top =  st.pop();

        insert(st, temp);
        
        st.push(top);


    }
    public static Stack<Integer> sort(Stack<Integer> st){
        if(st.size() <= 1) return st;


        int temp =  st.pop();

        sort(st);
        // waiting for the turn 

        insert(st,temp);

        return st;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        Stack<Integer> st  = new Stack<>();

        for (int i : arr) {
            st.add(i);
        }

        st =  sort(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }



    }
}
