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
    public void reorderList(ListNode head) {

        if( head==null||head.next==null) return ;

         ListNode slow =head,fast=head;
         while( fast!=null && fast.next!=null)
         {
            slow=slow.next;
            fast=fast.next.next;

         }
         ListNode curr=slow.next,prev=null,fut=null;
         slow.next=null;
         while(curr!=null)
         {
            fut=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fut;
         }
         ListNode sh=prev;
         ListNode fh=head;
         ListNode dummy=new ListNode(-1);
         ListNode temp=dummy;
         while (fh!=null ||sh!=null)
         {
            if(fh!=null)
            {
                temp.next=fh;
                fh=fh.next;
                temp=temp.next;

            }
            if(sh!=null)
            {
                temp.next=sh;
                sh=sh.next;
                temp=temp.next;

            }
         }
         head=dummy.next;
        
    }
}