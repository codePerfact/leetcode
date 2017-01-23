import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shilpa on 12/15/2016.
 */
public class Cloudera {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] values = new String[4];
        values[0] = "(]";
        values[1] = "(){}[]";
        values[2] = "([)]";
        values[3] = "((({}[])))";
        braces(values);

    }

    static String[] braces(String[] values) {
        String[] result = new String[values.length];
        if(values == null || values.length < 1){
            return result;
        }
        for (int i = 0; i < values.length; i++) {
            Stack<Character> stack = new Stack<Character>();
            for (int j=0; j<values[i].length(); j++){
                if(values[i].charAt(j) == '(' || values[i].charAt(j) == '{' || values[i].charAt(j) == '[') {
                    stack.push(values[i].charAt(j));
                }else if(values[i].charAt(j) == ')' && stack.empty() || values[i].charAt(j) == ')' && stack.pop() != '('){
                    result[i] = "NO";
                    break;
                }else if(values[i].charAt(j) == '}' && stack.empty() || values[i].charAt(j) == '}' && stack.pop() != '{'){
                    result[i] = "NO";
                    break;
                }else if(values[i].charAt(j) == ']' && stack.empty() || values[i].charAt(j) == ']' && stack.pop() != '['){
                    result[i] = "NO";
                    break;
                }
            }
            if(result[i] == null ) {
                if (!stack.isEmpty()) {
                    result[i] = "NO";
                } else {
                    result[i] = "YES";
                }
            }
        }
        return result;
    }
}
