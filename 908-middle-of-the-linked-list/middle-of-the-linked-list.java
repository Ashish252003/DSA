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
    public ListNode middleNode(ListNode head) {
        // Step 1: Count total number of nodes
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        // Step 2: Calculate middle index
        // For even length, we want the second middle node (count / 2)
        // For odd length, we want the middle node ((count / 2) + 1)
        int middleIndex = count / 2;
        
        // Step 3: Traverse to the middle node
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        
        return current;
    }
}