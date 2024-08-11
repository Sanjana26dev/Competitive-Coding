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
    int maxsum=Integer.MIN_VALUE;
    public int maxGain(TreeNode node) {
            if(node==null){
                return 0;

            }
            int leftgain= Math.max(maxGain(node.left),0);
            int rightgain= Math.max(maxGain(node.right),0);
            int printnewpath = node.val+leftgain+rightgain;
            maxsum=Math.max(maxsum,printnewpath);
            return node.val+Math.max(leftgain,rightgain); 

        
    }



    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxsum;
    }
}