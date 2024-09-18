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
    public TreeNode flattentree(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left ==null && root.right ==null){
            return root;
        }
        TreeNode lefttail=flattentree(root.left);
        TreeNode righttail=flattentree(root.right);
        if(lefttail!=null){
            lefttail.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return righttail==null?lefttail:righttail;
    }
    public void flatten(TreeNode root) {
        flattentree(root);
        
    }
}