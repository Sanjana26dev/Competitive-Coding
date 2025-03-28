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
    public int goodNodes(TreeNode root) {
        return countgoodnodes(root,Integer.MIN_VALUE);

        
    }
    public int countgoodnodes(TreeNode root,int maxsofar){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.val>=maxsofar){
            count++;
            maxsofar=root.val;
        }
        count += countgoodnodes(root.left,maxsofar);
        count += countgoodnodes(root.right, maxsofar);
        return count;
    }
}