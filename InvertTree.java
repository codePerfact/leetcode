/**
 * Created by shilpa on 9/14/2016.
 */
public class InvertTree {
    public static void main(String[] args){

    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }else {
            TreeNode result = new TreeNode(root.val);
            result.left = invertTree(root.right);
            result.right = invertTree(root.left);
            return result;
        }
    }
}
