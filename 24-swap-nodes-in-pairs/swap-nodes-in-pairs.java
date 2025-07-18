class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; // For iteration

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

           
            prev.next = second;
            first.next = second.next;
            second.next = first;

        
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}

/**
TC: O(N)
SC: O(1)
*/

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