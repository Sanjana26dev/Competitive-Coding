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
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;        
        }
        ListNode mid=getmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
         return merge(left,right);
    }
    public ListNode getmid(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;

    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);

        ListNode merge = dummy;
        while(list1 !=null && list2!=null){
            if(list1.val< list2.val){
                merge.next=list1;
                list1=list1.next;
            }
            else{
                merge.next=list2;
                list2=list2.next;


            }
            merge = merge.next;
        }
            if(merge.next == list1 && list1==null){
                merge.next = list2;
            }
            else{
                merge.next = list1;
            }
        
        return dummy.next;
        
    }


}