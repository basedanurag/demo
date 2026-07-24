// Min Stack 

import java.util.Stack;

// brute force 
class MinStack {
    // Stack<int[]> st;
    // public MinStack() {
    // st = new Stack<>();
    // }

    // public void push(int value) {
    // if(st.isEmpty()){
    // st.push(new int[]{value,value});
    // return;
    // }
    // int min = Math.min(getMin(), value);
    // st.push(new int[]{value,min});
    // }

    // public void pop() {
    // st.pop();
    // }

    // public int top() {
    // return st.peek()[0];
    // }

    // public int getMin() {
    // return st.peek()[1];
    // }
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {

        if (st.isEmpty()) {
            st.push((long) value);
            min = value;
            return;
        }

        if (value >= min) {
            st.push((long) value);
        } else {
            st.push(2L * value - min);
            min = value;
        }
    }

    public void pop() {

        if (st.isEmpty())
            return;

        long x = st.pop();

        if (x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {

        long x = st.peek();

        if (x >= min)
            return (int) x;

        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}

public class Q2 {

    public static void main(String[] args) {

    }
}