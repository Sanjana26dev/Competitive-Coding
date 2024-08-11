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
    int preind;
    Map<Integer,Integer> inorderindxmap ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preind =0;
        inorderindxmap=new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            inorderindxmap.put(inorder[i],i);
        }
        return arraytoTree(preorder,0,preorder.length-1);



        
    }
    public TreeNode arraytoTree(int[] preorder, int left,int right){
        if(left>right){
            return null;
        }
        int rootvalue = preorder[preind];
        preind++;
        TreeNode root = new TreeNode(rootvalue);
        root.left=arraytoTree(preorder,left,inorderindxmap.get(rootvalue)-1);
        root.right=arraytoTree(preorder,inorderindxmap.get(rootvalue)+1,right);
        return root;


    }

}