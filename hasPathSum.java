import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/16/2017.
 */
public class hasPathSum {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(1);
        root.right = new TreeNode(1);
        List<List<Integer>> r = pathSum(root,2);
        System.out.println();
    }


    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        _pathSum(root,sum,new ArrayList<Integer>());
        return result;
    }

    public static void _pathSum(TreeNode root, int target, ArrayList<Integer> curr){
        if(root == null)
            return;
        if((target - root.val) == 0 && root.left == null && root.right == null){
            curr.add(root.val);
            result.add(new ArrayList<>(curr));
        }else{

            if(root.left != null){
                curr.add(root.val);
                _pathSum(root.left, target-root.val, curr);
                curr.remove(curr.size()-1);
            }
            if(root.right != null){
                curr.add(root.val);
                _pathSum(root.right, target-root.val,curr);
                curr.remove(curr.size()-1);
            }
        }

    }


    public static boolean hasPathSum(TreeNode root, int sum) {

        if(root == null)
            return false;
        else{
            if((sum - root.val) == 0){
                if(root.left == null && root.right == null)
                    return true;
            }
            boolean result = false;
            if (root.left != null)
                result = result || hasPathSum(root.left,sum-root.val);
            if(root.right != null)
                result = result || hasPathSum(root.right,sum-root.val);
            return result;
        }
    }
}
