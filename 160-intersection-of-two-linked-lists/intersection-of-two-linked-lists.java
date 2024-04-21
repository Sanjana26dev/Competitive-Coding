/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2= headB;

        int s1 = 0, s2 = 0;
        while(p1 != null){
            s1++;
            p1 = p1.next;
        }
         while(p2 != null){
            s2++;
            p2 = p2.next;
        }
        p1 = headA;
        p2 = headB;
        
        if(s1>s2){
            int diff = s1-s2;
            while(diff>0){
               p1 = p1.next;
                diff--;
            }
        } else {
           int diff = s2-s1;
            while(diff>0){
               p2 = p2.next;
                diff--;
            } 
        }
        while(p1!=null && p2 != null && p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
       if(p1==null) return null;
       return p1;
	}

}