import javax.transaction.TransactionRequiredException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/11/2016.
 */
public class RestoreTree {

    public  ArrayList<Integer> inOrder = new ArrayList<>();
    public static void main(String[] args){

    }

    public  ArrayList<Integer> recoverTree(TreeNode a) {
       Inorder(a);
        int first = -1;
        int middle = -1;
        int last = -1;
        for(int i=0; i<inOrder.size(); i++){
            if(i-1 >= 0 && inOrder.get(i) < inOrder.get(i-1)){
                if(first == -1){
                    first = i-1;
                    middle = i;
                }else{
                    last = i;
                }
            }
        }
        if(first != -1 && last != -1){
            return new ArrayList<>(Arrays.asList(inOrder.get(first), inOrder.get(last)));
        }else{
            return new ArrayList<>(Arrays.asList(inOrder.get(first), inOrder.get(middle)));
        }
    }

    public  void Inorder(TreeNode root){
        if(root != null){
            Inorder(root.left);
            inOrder.add(root.val);
            Inorder(root.right);
        }
    }

    public static ArrayList<Integer> recoverTreeUtil(TreeNode root, TreeNode first, TreeNode middle, TreeNode last, TreeNode prev){
        if(root != null){
            recoverTreeUtil(root.left,first,middle,last,prev);
            if(prev != null && root.val < prev.val){
                if(first == null){
                    first = prev;
                    middle = root;
                }else{
                    last = root;
                }
            }

            prev = root;
            recoverTreeUtil(root.right, first, middle, last, prev);
            return null;
        }else{
            if(first != null && last != null) {
                return new ArrayList<Integer>(Arrays.asList(first.val,last.val));
            }else{
                return new ArrayList<Integer>(Arrays.asList(first.val, middle.val));
            }
        }
    }
}
