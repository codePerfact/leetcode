/**
 * Created by shilpa on 9/17/2016.
 */
public class isPresent {

    private static int isPresent(Node root, int val){
        if(root == null){
            return 0;
        }else if(root.data == val){
            return 1;
        } else if(val < root.data){
                return isPresent(root.left,val);
        }else{
            return isPresent(root.right,val);
        }
    }
}
