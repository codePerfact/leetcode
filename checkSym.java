/**
 * Created by shilpa on 9/19/2016.
 */
public class checkSym {
    public static void main(String[] args){

    }
    public boolean isSymmetric(TreeNode root) {
       return isSymmetricUtil(root,root);
    }

    public Boolean isSymmetricUtil(TreeNode root1, TreeNode root2){
        if(root1 ==null && root2 == null) {
            return true;
        }

        if(root1 != null && root2 != null && root1.val == root2.val && isSymmetricUtil(root1.left,root2.right) && isSymmetricUtil(root1.right, root2.left)) {
            return true;
        }

        return false;
    }

}
