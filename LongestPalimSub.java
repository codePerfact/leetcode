import java.util.Arrays;

/**
 * Created by shilpa on 1/7/2017.
 */
public class LongestPalimSub {
    public static void main(String[] args){
        System.out.println(longestPalindrome("cbbd"));
    }
    public static String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        boolean[][] matrix = new boolean[s.length()][s.length()];
        for(int i=0; i<s.length()-1; i++){
            Arrays.fill(matrix[i],false);
        }
        int maxLen = 0;
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            matrix[i][i] = true;
            maxLen = 1;
            start = i;
            end = i;
        }

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                matrix[i][i+1] = true;
                maxLen = 2;
                start = i;
                end = i+1;
            }
        }
        for(int k = 3; k<=s.length(); k++){
            for(int i=0; i< s.length()-k+1;i++){
                int j = i+k-1;
                if(s.charAt(i) == s.charAt(j) && matrix[i+1][j-1]){
                    matrix[i][j] = true;
                    if(j-i+1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
