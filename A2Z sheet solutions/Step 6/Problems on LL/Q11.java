import java.util.HashMap;
import java.util.Map;

public class Q11 {
    public static ListNode find(ListNode headA, ListNode headB , int d){
        ListNode tempA = headA;
        ListNode tempB =  headB;
        while (d != 0) {
            
            tempA =  tempA.next;
            d--;
        }
        while (tempA != null ) {
            if(tempA == tempB){
                return tempA;
            }
            tempA =  tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
    public static ListNode getIntersectionNodeBetter(ListNode headA, ListNode headB){
        if(headA == null) return null;
        if(headB == null) return null;
        ListNode intersection =  null;
        ListNode tempA=  headA;
        int lengthA =  0;
        while (tempA !=  null) {
            lengthA ++;
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        int lengthB =  0;
        while (tempB != null) {
            lengthB++;
            tempB =   tempB.next;
        }
        if(lengthA > lengthB){
            intersection = find(headA, headB, lengthA -lengthB);
        }else{
            intersection = find( headB, headA,lengthB -  lengthA);
        }
        return intersection;
    }
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
        // listA = [4,1,8,4,5], listB = [5,6,1,8,4,5],
        // Common intersection part
    ListNode common = new ListNode(8);
    common.next = new ListNode(4);
    common.next.next = new ListNode(5);

    // List A: 4 -> 1 -> 8 -> 4 -> 5
    ListNode head = new ListNode(4);
    head.next = new ListNode(1);
    head.next.next = common;

    // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
    ListNode headB = new ListNode(5);
    headB.next = new ListNode(6);
    headB.next.next = new ListNode(1);
    headB.next.next.next = common;

    ListNode intersection = getIntersectionNodeBetter(head, headB);

    if (intersection != null) {
        System.out.println("Intersection at node: " + intersection.val);
    } else {
        System.out.println("No Intersection");
    }


    }
}
