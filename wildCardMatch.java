import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 1/11/2017.
 */
public class wildCardMatch {
    public static void main(String[] args){
        System.out.println(isMatch("aa","aa"));
    }
    public static boolean isMatch(String s, String p) {
        StringBuilder sb = new StringBuilder();

        p = sb.toString(); for(int i=0; i<p.length(); i++){
            if((i > 0 && p.charAt(i) == '*' && p.charAt(i-1) == p.charAt(i)) ){
                continue;
            }
            sb.append(p.charAt(i));
        }
        boolean[][] matrix = new boolean[s.length()+1][p.length()+1];
        matrix[0][0] = true;
        if(p.length() > 0 && p.charAt(0) == '*'){
            matrix[0][1] = true;
        }
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<p.length(); j++){
                if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                    matrix[i+1][j+1] = matrix[i][j];
                }else if(p.charAt(j) == '*'){
                    matrix[i+1][j+1] = matrix[i][j+1] || matrix[i+1][j];
                }else{
                    matrix[i+1][j+1] = false;
                }
            }
        }
        return matrix[s.length()][p.length()];
    }
}
