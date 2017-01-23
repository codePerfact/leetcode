import javax.xml.parsers.FactoryConfigurationError;
import java.util.Stack;

public class FindingCycle{

    public static void main(String[] args){
        System.out.println(isBalanced("{[()]}"));
    }
    public static boolean isBalanced(String expression) {
        if(expression == null){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                stack.push(expression.charAt(i));
            } else if(expression.charAt(i) == ')'){
                if(stack.empty() || stack.pop() != '(')
                    return false;
            } else if(expression.charAt(i) == '}'){
                if(stack.empty() || stack.pop() != '{')
                    return false;
            } else if(expression.charAt(i) == ']'){
                if(stack.empty() || stack.pop() != '[')
                    return false;
            }
        }
        if(!stack.empty())
            return false;
        else
            return true;
    }
}
