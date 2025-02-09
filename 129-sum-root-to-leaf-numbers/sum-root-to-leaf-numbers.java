/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int wholesum=0;

    public int sumNumbers(TreeNode root) {
        findsum(root,0);
        return wholesum;
        
        
    }
    public void findsum(TreeNode root,int currsum){
        if(root==null){return;}
        if(root!=null && root.left==null && root.right==null){
            currsum=currsum*10 + root.val;
            wholesum+=currsum;
        }
        findsum(root.left,(currsum*10) + root.val);
        findsum(root.right,(currsum*10) + root.val);
    }
}