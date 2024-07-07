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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();


        TreeNode curr = root;
        while(curr!=null){
            if(curr.left == null){
                res.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode currp1 = curr.left;
                while(currp1.right != null && currp1.right != curr){                    
                    currp1 = currp1.right;
                }
                if(currp1.right == null){
                    currp1.right = curr;
                    res.add(curr.val);

                    curr = curr.left;
                }
                else{
                    currp1.right = null;
                    curr = curr.right;


                }
            }
        }
        return res;
        
    }
}
       
