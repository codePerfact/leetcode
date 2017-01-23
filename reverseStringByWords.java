import java.util.Stack;

/**
 * Created by shilpa on 1/19/2017.
 */
public class reverseStringByWords {
    public static void main(String[] args){
        System.out.println(reverseWords("    a     b"));

    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" +");
        Stack<String> words = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            words.push(arr[i]);
        }
        while (!words.isEmpty()){
            sb.append(words.pop() + " ");
        }
        return sb.toString().trim();
    }
}
