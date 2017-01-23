/**
 * Created by shilpa on 1/16/2017.
 */

class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
}


public class ConnectTree {
    public static void main(String[] args){
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.right.right = new TreeLinkNode(5);
        root.right.right.right = new TreeLinkNode(6);

        connect(root);
        System.out.println();
    }
    public static void connect(TreeLinkNode root) {
        while (root != null){
            TreeLinkNode thisNode = root;
            while (thisNode != null){
                if(thisNode.left != null && thisNode.right != null){
                    thisNode.left.next = thisNode.right;
                    thisNode.right.next = getNextLevelFirst(thisNode.next);
                }else if(thisNode.left != null || thisNode.right != null){
                    getNextLevelFirst(thisNode).next = getNextLevelFirst(thisNode.next);
                }
                thisNode = thisNode.next;
            }
            root = getNextLevelFirst(root);
        }
    }

    public static TreeLinkNode getNextLevelFirst(TreeLinkNode root){
        if(root == null) return null;
        else if(root.left != null) return root.left;
        else if(root.right != null) return root.right;
        else return getNextLevelFirst(root.next);
    }
}
