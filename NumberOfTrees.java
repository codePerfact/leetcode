import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/14/2017.
 */
public class NumberOfTrees {
    public static void main(String[] args){
        List<TreeNode> result = generateTrees(3);
        System.out.println();
    }
    public static List<TreeNode> generateTrees(int n) {
        return _generateTrees(1, n);
    }

    public static List<TreeNode> _generateTrees(int start, int end){
        List<TreeNode> result = new ArrayList<>();
        if(start > end){
            result.add(null);
            return result;
        }else{

            for(int i=start; i<=end; i++){
                TreeNode root = new TreeNode(i);
                List<TreeNode> leftSubTrees = _generateTrees(start,i-1);
                List<TreeNode> rightSubTrees = _generateTrees(i+1,end);
                for(TreeNode left : leftSubTrees){
                    for(TreeNode right : rightSubTrees){
                        root.left = left;
                        root.right = right;
                        result.add(root);
                    }
                }
            }
            return result;
        }
    }
}
