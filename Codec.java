import java.util.ArrayList;
import java.util.Arrays;


public class Codec {
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        String r = serialize(root);
        TreeNode back = deserialize(r);
        System.out.println(back.val);
    }


        public static String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            _serialize(root, sb);
            return sb.toString();
        }
        public static void  _serialize(TreeNode root, StringBuilder sb){
            if(root == null){
                sb.append("#,");
                return;
            }
            else {
                sb.append(root.val);
                sb.append(",");
                _serialize(root.left, sb);
                _serialize(root.right,sb);
            }
        }



        public static TreeNode deserialize(String data) {
            String[] list = data.split(",");
            ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(list));
            return _deserialize(list1);
        }
        public static TreeNode _deserialize(ArrayList<String> data){
            int val;
            if(data.size() <=0){
                return null;
            }else if(data.get(0).equals("#")){
                data.remove(0);
                return null;
            }else{
                TreeNode root = new TreeNode(Integer.parseInt(data.get(0)));
                data.remove(0);
                root.left = _deserialize(data);
                root.right = _deserialize(data);
                return root;
            }
        }


    }

