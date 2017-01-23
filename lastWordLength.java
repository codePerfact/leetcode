/**
 * Created by shilpa on 1/12/2017.
 */
public class lastWordLength {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("  Hello    world   "));
    }
    public static int lengthOfLastWord(String s) {
        if(s.length() == 0)
            return 0;
        int start = 0;
        int end = 0;
        s = s.trim();
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != s.charAt(i)){
                start = i+1;
            }
        }
        return s.length()-1-start+1;
    }
}
