import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        Map<ListNode, Integer> map = new HashMap<>();

        ListNode temp = head;
        while (temp != null) {
            if (map.containsKey(temp)) {
                return true;
            }

            map.put(temp, map.getOrDefault(temp, 0) + 1);

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Q3 solution = new Q3();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        head.next.next.next = head.next;
        System.out.println("Has cycle: " + solution.hasCycle(head));
    }
}
