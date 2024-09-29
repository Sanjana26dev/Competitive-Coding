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
    public int getHeight(TreeNode tree) {
      if(tree==null){
        return 0;
      }
      int leftheight=getHeight(tree.left);
      int rightheight=getHeight(tree.right);
      return 1+Math.max(leftheight,rightheight);


  
    
  }

  public boolean isBalanced(TreeNode tree) {
    if(tree==null){return true;}
    int leftheight=getHeight(tree.left);
    int rightheight=getHeight(tree.right);
    if(Math.abs(leftheight-rightheight)>1){
      return false;
    }
    return isBalanced(tree.left) && isBalanced(tree.right); 

    // Write your code here.
    
  
  }
}