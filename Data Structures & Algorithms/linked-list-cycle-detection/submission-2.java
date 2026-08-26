/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        HashMap visited = new HashMap<ListNode, ListNode>();

        while (head.next != null) {
            if (visited.containsKey(head.next)) return true;
            visited.put(head, head.next);
            head = head.next;
        }
        return false;
    }
}
