/**
 * Created by shilpa on 9/9/2016.
 */
public class CntInsertion {
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(9);
        TreeNode node4 = new TreeNode(20);


        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(10);
      node1.left = node2;
        node2.left = node4;
        node1.right = node3;

        node5.right = node6;
        node5.left = node7;
        node7.left = node8;
        node7.right = node9;
        //node6.left = node7;
             System.out.println(cntMatrix(node1, node5));


    }

    public static int cntMatrix(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return 0;
        } else if (b == null && a != null) {
            return -1;
        } else if (a == null && b != null) {
            return 1 + cntMatrix(a, b.left) + cntMatrix(a, b.right);
        } else {
            return cntMatrix(a.left, b.left) + cntMatrix(a.right, b.right);
        }
    }
    }
