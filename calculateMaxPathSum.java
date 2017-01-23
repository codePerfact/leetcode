/**
 * Created by shilpa on 1/17/2017.
 */
public class calculateMaxPathSum {
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        _maxPathSum(root,max);
        return max[0];
    }
    public int _maxPathSum(TreeNode root, int[] max){
        if(root == null)
            return 0;
        int left = _maxPathSum(root.left,max);
        int right = _maxPathSum(root.right,max);
        int current = Math.max(root.val, Math.max(root.val+left,root.val+right));
        max[0] = Math.max(max[0],Math.max(current,left+root.val+right));
        return current;
    }
}
