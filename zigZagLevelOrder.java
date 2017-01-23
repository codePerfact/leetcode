import java.util.*;

/**
 * Created by shilpa on 1/16/2017.
 */
public class zigZagLevelOrder {
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        zigzagLevelOrder(root);
        System.out.println();
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return result;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        Stack<TreeNode>temp = new Stack<>();
        boolean flag = false;
        stack1.push(root);
        TreeNode curr;
        ArrayList<Integer> list = new ArrayList<>();
        while (stack1.size() != 0){
            list.clear();
            while (stack1.size() != 0) {
                curr = stack1.pop();
                list.add(curr.val);
                if (flag == false) {
                    if (curr.left != null)
                        stack2.push(curr.left);
                    if (curr.right != null)
                        stack2.push(curr.right);
                }else{
                    if (curr.right != null)
                        stack2.push(curr.right);
                    if (curr.left != null)
                        stack2.push(curr.left);
                }
            }
            flag = !flag;
            temp = stack1;
            stack1 = stack2;
            stack2 = temp;
            result.add(new ArrayList<Integer>(list));
        }
        return result;
    }
}
