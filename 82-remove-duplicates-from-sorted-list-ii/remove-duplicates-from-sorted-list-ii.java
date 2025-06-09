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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0,head);
        ListNode mover =temp;
        while(head!=null)
        {
            while(head.next!=null&&head.val==head.next.val)
            head=head.next;
            if(mover.next==head)
            mover=mover.next;
            else
            mover.next=head.next;
            head=head.next;
        }

        return temp.next;
        
    }
}