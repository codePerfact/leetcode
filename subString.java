/**
 * Created by shilpa on 12/25/2016.
 */
public class subString {
    public static void main(String[] args){
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    public  static boolean isSubsequence(String s, String t) {
        //s is the subsequence
        // t is tha main string
        int i=0;
        int j=0;
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        while (j < t.length()&& i<s.length()){
            if(t.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }else {
                j++;
            }
        }
        if(i == s.length()){
            return true;
        }else{
            return false;
        }
    }
}
