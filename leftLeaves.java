/**
 * Created by shilpa on 1/2/2017.
 */
public class leftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                ans += root.left.val;
            }else{
                ans += sumOfLeftLeaves(root.left);
            }
        }
        ans += sumOfLeftLeaves(root.right);
        return ans;
    }
}
