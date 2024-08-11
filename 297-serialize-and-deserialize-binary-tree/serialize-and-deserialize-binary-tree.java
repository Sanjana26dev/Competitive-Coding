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

        
        public String reserialize(TreeNode root, String str) {
        if(root==null){
            str+="null ";
        }
        else{
            str+=str.valueOf(root.val) + " ";
            str=reserialize(root.left, str);
            str=reserialize(root.right,str);
        }
        return str;
    }

    public String serialize(TreeNode root) {
        return reserialize(root,"");
    }


    // Decodes your encoded data to tree.
    public TreeNode redeserialize(List<String> str) {
        if(str.get(0).equals("null")){
            str.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str.get(0)));
        str.remove(0);
        root.left = redeserialize(str);
        root.right = redeserialize(str) ;
        return root;
    }

    public TreeNode deserialize(String data) {
        String[] stArray = data.split(" ");
        List<String> strList= new LinkedList<String>(Arrays.asList(stArray));
        return redeserialize(strList);
    }

}