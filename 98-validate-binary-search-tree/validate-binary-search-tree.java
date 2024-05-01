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
    public boolean isValidBST(TreeNode root) {
        return isBST(root , Long.MIN_VALUE , Long.MAX_VALUE);
        
    }
    public boolean isBST(TreeNode root , long min , long max){
        if(root==null){return true;}
        long rval=root.val;
        if(rval < min || rval > max ){
            return false;
        }
        boolean l = isBST( root.left , min , rval-1);
        boolean r = isBST(root.right , rval+1 , max);
        if(l==false || r==false){
            return false;
        }
        return true;
    }
}