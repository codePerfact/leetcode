/**
 * Created by shilpa on 1/16/2017.
 */
public class flattenBt {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        flatten(root);
        System.out.println();
    }
    public static void flatten(TreeNode root) {
        root = _flatten(root);
    }
    public static TreeNode _flatten(TreeNode root){
        if(root == null || (root.left == null && root.right == null))
            return root;
        TreeNode temp = root;
        TreeNode left = _flatten(root.left);
        TreeNode right = _flatten(root.right);
        root.left = null;
        root.right  = left;
        while (root.right != null)
            root = root.right;
        root.right = right;
        return temp;
    }
}
