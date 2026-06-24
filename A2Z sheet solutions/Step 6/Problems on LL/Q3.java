import java.util.HashMap;
import java.util.Map;
 class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

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
}
