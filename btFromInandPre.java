/**
 * Created by shilpa on 1/16/2017.
 */
public class btFromInandPre {
    static int postIndex = 0;
    public static void main(String[] args){
        int[] inorder = {4,2,6,1,7,3,5};
        int[] postorder = {4,6,2,7,5,3,1};
        TreeNode root = buildTree(postorder,inorder);
        System.out.println();
    }
    public static TreeNode buildTree(int[] postorder, int[] inorder) {
        postIndex = inorder.length-1;
        return _buildTree(postorder,inorder,0,inorder.length-1);
    }
    static TreeNode _buildTree(int[] postorder, int[] inorder, int start, int end){
        if(start > end)
            return null;
        TreeNode curr = new TreeNode(postorder[postIndex--]);
        int inIndex=0;
        for(int i=start; i<=end; i++){
            if(inorder[i] == curr.val) {
                inIndex = i;
                break;
            }
        }
        curr.right = _buildTree(postorder,inorder,inIndex+1,end);
        curr.left = _buildTree(postorder,inorder,start,inIndex-1);
        return curr;
    }
}
