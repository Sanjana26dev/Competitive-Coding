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
    TreeNode s,f,prev;
    public void recoverTree(TreeNode root) {
        f = s = prev = null;
        inorder(root);
        int t = f.val;
        f.val = s.val;
        s.val = t;
    }
    public void inorder(TreeNode curr){
        if(curr == null) return;
        
        inorder(curr.left);
        if(prev != null && curr.val < prev.val &&  f == null){
            f = prev;
            s = curr;
        }
        else if(prev != null && curr.val < prev.val &&  f != null) s = curr;
        prev = curr;
        inorder(curr.right);
    }
}

        
    