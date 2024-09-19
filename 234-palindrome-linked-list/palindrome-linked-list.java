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
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverseList(slow.next);
        ListNode p1=head;

        ListNode p2=secondhalf;
        boolean isPallindrome=true;
        while(p2!=null){
            if(p1.val!=p2.val){
                isPallindrome=false;
                break;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return isPallindrome;
    }
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}