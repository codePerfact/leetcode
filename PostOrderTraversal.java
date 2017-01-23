import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by shilpa on 1/19/2017.
 */
public class PostOrderTraversal {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> result = postorderTraversal(root);
        System.out.println();
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode top = stack1.pop();
            if(top.left != null)
                stack1.push(top.left);
            if(top.right != null)
                stack1.push(top.right);
            stack2.push(top);
        }
        while (!stack2.isEmpty()){
            result.add(stack2.pop().val);
        }
        return result;
    }
}
