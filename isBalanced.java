/**
 * Created by shilpa on 1/16/2017.
 */
public class isBalanced {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(isBalanced(root));
    }



    public static boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        height(root);
        boolean result = isBalanced(root.left) && isBalanced(root.right);
        int leftHeight = 0;
        if(root.left != null)
            leftHeight = root.left.val;
        int rightHeight = 0;
        if(root.right != null)
            rightHeight = root.right.val;
        result = result && (Math.abs(leftHeight-rightHeight)<2);
        return result;
    }

    public static int height(TreeNode root){
        if(root == null)
            return 0;
        root.val =  1+Math.max(height(root.left),height(root.right));
        return root.val;
    }

}
