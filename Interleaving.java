/**
 * Created by shilpa on 1/15/2017.
 */
public class Interleaving {
    public static void main(String[] args){
        System.out.println(isInterleave("aabc","abad","aabadabc"));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() != (s1.length() + s2.length()))
            return false;
        boolean[][] dp = new boolean[s2.length()+1][s1.length()+1];
        dp[0][0] = true;
        for(int i=1; i<=s1.length() && i<=s3.length(); i++){
            if(s1.charAt(i-1) == s3.charAt(i-1)){
                dp[0][i] = dp[0][i-1];
            }else{
                break;
            }
        }
        for(int i=1; i<=s2.length() && i<=s3.length(); i++){
            if(s2.charAt(i-1) == s3.charAt(i-1)){
                dp[i][0] = dp[i-1][0];
            }else{
                break;
            }
        }
        for(int i=1; i<=s2.length(); i++){
            for(int j=1; j<= s1.length(); j++){
                boolean flag = false;
                if(i+j-1 < s3.length() && s1.charAt(j-1) == s3.charAt(i+j-1)) {
                    flag = true;
                    dp[i][j] = dp[i][j] || dp[i][j - 1];
                }
                if(i+j-1 < s3.length() && s2.charAt(i-1) == s3.charAt(i+j-1)) {
                    flag = true;
                    dp[i][j] = dp[i][j] || dp[i - 1][j];
                }
                if(flag == false) {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s2.length()][s1.length()];
    }
}
