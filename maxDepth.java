/**
 * Created by shilpa on 1/2/2017.
 */
public class maxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }
    }
}
