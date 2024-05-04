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
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;

        
    }
    int greater=0;
    public void helper(TreeNode root){
        if(root==null){return;}
        helper(root.right);
        greater=greater+root.val;
        root.val=greater;

        helper(root.left);
    }
}