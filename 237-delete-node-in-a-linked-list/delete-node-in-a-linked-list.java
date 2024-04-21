/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode after=node.next;
        int value=after.val;
        node.val=value;
        node.next=after.next;
        after.next=null;

        
    }
}