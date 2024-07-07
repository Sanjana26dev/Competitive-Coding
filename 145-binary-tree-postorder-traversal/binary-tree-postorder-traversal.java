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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.right == null){
                res.add(curr.val);
                curr=curr.left;
            }
            else{
                TreeNode currp1 = curr.right;
                while(currp1.left != null && currp1.left != curr){                    
                    currp1 = currp1.left;
                }
                if(currp1.left == null){
                    currp1.left = curr;
                    res.add(curr.val);


                    curr = curr.right;
                }
                else{
                    currp1.left = null;

                    curr = curr.left;


                }
            }
        }
        Collections.reverse(res);
        return res;


        
    }
}