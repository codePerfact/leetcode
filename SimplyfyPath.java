import java.util.Stack;

/**
 * Created by shilpa on 1/14/2017.
 */
public class SimplyfyPath {
    public static void main(String[] args){
        System.out.println(simplifyPath("/abc/..."));
    }
    public static String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() > 0){
                if(arr[i].equals("..")) {
                    if(!stack.empty()){
                        stack.pop();
                    }
                }else if(!arr[i].equals(".")){
                    stack.push(arr[i]);
                }
            }
        }
        Stack<String> stack1 = new Stack<>();
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!stack1.isEmpty()){
            sb.append("/");
            sb.append(stack1.pop());
        }
        if (sb.length() == 0){
            sb.append("/");
        }
        return sb.toString();
    }
}
