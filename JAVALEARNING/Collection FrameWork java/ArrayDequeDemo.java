import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        /*
         * agar first in first out kr rhe hai to to vo as a queue behave karega
         * agar first in last out kr rhe hai to vo Stack ki trha behave karega
         * or agar ye chize bi directional hongi to as Deque ki trha work karega 
         * although it is ArrayDeque ham isko sort nhi kr sakte by using Collections Sort
         */
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(5);
        dq.offerFirst(1);
         dq.forEach(x -> System.out.println(x));
        dq.pollLast();
        
        System.out.println("after deletion");
         dq.forEach(x -> System.out.println(x));
         dq.offerLast(20);
          dq.offerLast(21);
           dq.offerLast(22);
           dq.poll();
           System.out.println("after using poll method");
        dq.forEach(x -> System.out.println(x));
       
    }
}
