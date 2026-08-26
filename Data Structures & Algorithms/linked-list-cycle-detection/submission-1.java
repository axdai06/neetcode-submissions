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
        HashSet visited = new HashSet<>();

        while (head != null) {
            if(visited.contains(head.next)) return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}
