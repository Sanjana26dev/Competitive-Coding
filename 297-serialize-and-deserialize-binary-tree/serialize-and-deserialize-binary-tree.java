/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
            
        StringBuilder sb = new StringBuilder();
        Helper1(root , sb);
        return sb.toString();
    }
    public void Helper1(TreeNode root , StringBuilder sb){
        if(root == null){
            sb.append("# ");
            return;
        }
        sb.append(root.val+" ");
        Helper1(root.left , sb);
        Helper1(root.right , sb);
    }
    // Decodes your encoded data to tree.
    int i;
    public TreeNode deserialize(String data) {
        String[] ch = data.split(" ");
        i = 0;
        return Helper2(ch);
    }
    public TreeNode Helper2(String [] ch){   
        if(ch[i].equals("#")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(ch[i]));
        i++;
        root.left = Helper2(ch);
        root.right = Helper2(ch);
        return root;
    

        
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));