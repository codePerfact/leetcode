/**
 * Created by shilpa on 1/18/2017.
 */
public class SumRootLeaf {
    static int totalSum=0;
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumNumbers(root));
    }
    public static int sumNumbers(TreeNode root) {
        _sumNumbers(root,0);
        return totalSum;
    }

    public static void _sumNumbers(TreeNode root, int currSum){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            totalSum += currSum == 0 ? root.val : (currSum*10+root.val);
            return;
        }
        if(root.left != null){
            _sumNumbers(root.left,currSum == 0?root.val : (currSum*10+root.val));
        }
        if(root.right != null){
            _sumNumbers(root.right,currSum == 0?root.val : (currSum*10+root.val));
        }
    }
}
