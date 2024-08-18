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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        ListNode ktail = null;
        ListNode newhead=null;
        while(ptr!=null){
            int count =0;
            ptr=head;
            while(count < k && ptr != null){
                ptr=ptr.next;
                count++;

            }
            if(count == k){
                ListNode revhead = reverseList(head,k);
                if(newhead==null){
                    newhead= revhead;
                }
                if(ktail!=null){
                    ktail.next=revhead;
                }
                ktail=head;
                head=ptr;
            }
        }
        if(ktail!=null){
            ktail.next = head;
        }
        return newhead == null? head:newhead;
    }
        public ListNode reverseList(ListNode head,int k) {
        ListNode prev = null;
        ListNode curr= head;
        while(k>0){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
            k--;
        }
        return prev;
        
    }

}