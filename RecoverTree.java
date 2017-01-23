/**
 * Created by shilpa on 1/15/2017.
 */
public class RecoverTree {
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }

    public void traverse(TreeNode root){
        if(root == null)
            return;
        traverse(root.left);
        if(firstNode == null && root.val <= prev.val)
            firstNode = prev;
        if(firstNode != null && root.val <= prev.val){
            secondNode = root;
        }
        prev = root;
        traverse(root.right);
    }
}
