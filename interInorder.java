/**
 * Created by shilpa on 12/26/2016.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class interInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null){
            stack.push(root);
            root = root.left;
        }
        while (stack.size() > 0){
            root = stack.pop();
            result.add(root.val);
            if(root.right != null){
                root = root.right;
                while (root != null){
                    stack.push(root);
                    root = root.left;
                    }
                }
            }
            return result;
    }
}
