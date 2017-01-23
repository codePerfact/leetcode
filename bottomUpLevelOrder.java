import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shilpa on 1/16/2017.
 */
public class bottomUpLevelOrder {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = levelOrder(root);
        List<List<Integer>> bottomUp = new ArrayList<>();
        for(int i=levelOrder.size()-1; i>=0; i--){
            bottomUp.add(levelOrder.get(i));
        }
        return bottomUp;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!queue.isEmpty()){
                TreeNode pop = queue.remove();
                list.add(pop.val);
                if(pop.left != null) temp.add(pop.left);
                if(pop.right != null) temp.add(pop.right);
            }
            queue = temp;
            result.add(list);
        }
        return result;
    }
}
