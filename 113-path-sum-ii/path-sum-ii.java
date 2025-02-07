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
    List<List<Integer>> ans = new ArrayList<>();
    public void dfs(TreeNode root,List<Integer> path,int remainsum){
        if(root==null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && remainsum == root.val) {
            ans.add(new ArrayList<>(path));
        }  dfs(root.left,path,remainsum-root.val);
        dfs(root.right,path,remainsum-root.val);
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        dfs(root,path,targetSum);
        return ans;
        
    }
}