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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        LinkedList<TreeNode> nodestack =new LinkedList<>();
        LinkedList<Integer> sumstack = new LinkedList<>();
        nodestack.add(root);
        sumstack.add(targetSum-root.val);
        TreeNode node;
        int currsum;
        while(!nodestack.isEmpty()){
            node=nodestack.pollLast();
            currsum=sumstack.pollLast();
            if(node.right==null && node.left==null && currsum==0){
                return true;
            }
            if(node.right!=null){
                nodestack.add(node.right);
                sumstack.add(currsum-node.right.val);
            }
            if(node.left!=null){
                nodestack.add(node.left);
                sumstack.add(currsum-node.left.val);
            }

        }
        return false;


        
        
    }
}