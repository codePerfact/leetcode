/**
 * Created by shilpa on 1/16/2017.
 */
public class minDepth {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(minDepth(root));
    }
    public static int minDepth(TreeNode root) {
        return _minDepth(root);
    }

    public static int _minDepth(TreeNode root){
        if(root == null)
            return 0;
        if(root.left != null && root.right != null)
            return 1 + Math.min(_minDepth(root.left),_minDepth(root.right));
        else if(root.left != null)
            return 1+_minDepth(root.left);
        else if(root.right != null)
            return 1+_minDepth(root.right);
        else
            return 1;
    }
}
