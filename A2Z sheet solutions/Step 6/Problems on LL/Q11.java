import java.util.HashMap;
import java.util.Map;

public class Q11 {
    // self coded for the better ans 
     public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null) return null;
        if(headB == null) return null;
        Map<ListNode, Integer> freq = new HashMap<>();

        ListNode tempA =  headA;
        ListNode tempB =  headB;
        while(tempA != null){
            freq.put(tempA, freq.getOrDefault(tempA, 0)+ 1);
            tempA = tempA.next;
        }
        while(tempB != null){
           if(freq.containsKey(tempB)){
                return tempB;
           }

            tempB = tempB.next;
        }
        
        return null;
    }
    public static void main(String[] args) {
        
    }
}
