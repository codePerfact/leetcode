import java.util.Stack;

/**
 * Created by shilpa on 1/19/2017.
 */
public class reversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        if(tokens.length == 0)
            return 0;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(tokens[i].equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(tokens[i].equals("/")){
                int t = stack.pop();
                stack.push(stack.pop()/t);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
