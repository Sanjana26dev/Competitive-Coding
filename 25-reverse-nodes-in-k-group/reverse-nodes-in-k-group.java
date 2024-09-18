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
        ListNode ptr=head;
        ListNode ktail=null;
        ListNode newhead=null;
        while(ptr!=null){
            int count=0;
            ptr=head;
            while(count<k && ptr!=null){
                ptr=ptr.next;
                count++;
            }
            if(count==k){
                ListNode rev=reverselist(head,k);
                if(newhead==null){
                    newhead=rev;
                }
                if(ktail!=null){
                    ktail.next=rev;
                }
                ktail=head;
                head=ptr;
            }
        }
        if(ktail!=null ){
            ktail.next=head;
        }
        return newhead == null? head:newhead;
    }
    public ListNode reverselist(ListNode head,int k){
        ListNode ptr=head;
        ListNode newhead=null;
        while(k>0){
            ListNode temp = ptr.next;
            ptr.next=newhead;
            newhead=ptr;
            ptr=temp;

            k--;
        }
        return newhead;
    }

}