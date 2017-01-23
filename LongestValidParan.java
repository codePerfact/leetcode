import java.util.Stack;

/**
 * Created by shilpa on 1/10/2017.
 */
public class LongestValidParan {
    public static void main(String[] args){
        System.out.println(longestValidParentheses("()(()"));
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int tempCount = 0;
        int count = 0;
        if(s.length() >= 2){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.push(i);
                }else if(s.charAt(i) == ')'){
                    int top = stack.pop();
                    if(!stack.isEmpty()){
                        tempCount = i-stack.peek();
                        if(tempCount > count)
                            count = tempCount;
                    }else{
                        stack.push(i);
                    }
                }
            }
        }else{
            return 0;
        }
        return count;
    }
}
