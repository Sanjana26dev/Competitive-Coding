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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
                
            
        height(root);
        return ans;
    }
     int height(TreeNode node) 
    {
        if(node == null) return -1;
        int lht = height(node.left);
        int rht = height(node.right);
        ans = Math.max(ans , lht+rht+2);
        return Math.max(lht,rht)+1;
    }
    


        
    
}