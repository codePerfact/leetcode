import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/18/2017.
 */
public class PalindromPartitioning {
    static List<List<String>> result = new ArrayList<>();
    public static void main(String[] args){
        System.out.println(minCut("eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj"));
        System.out.println();
    }

    public static int minCut(String s) {
      int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int cut[] = new int[n];
        for(int j=0; j<n; j++){
            cut[j] = j;
            for(int i=0; i<=j; i++){
                if(s.charAt(i) == s.charAt(j) && (j-i <= 1 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if(i>0){
                        cut[j] = Math.min(cut[j],cut[i-1]+1);
                    }else{
                        cut[j] = 0;
                    }
                }
            }
        }
        return cut[n-1];
    }

    public static List<List<String>> partition(String s) {
        _partition(s,new ArrayList<>());
        return result;
    }

    public static void _partition(String s, ArrayList<String> currList){
        if(s.length() == 0){
            result.add(new ArrayList(currList));
        }else{
            for(int l=1; l<=s.length(); l++){
                if(palindrom(s.substring(0,l))){
                    currList.add(s.substring(0,l));
                    _partition(s.substring(l,s.length()),currList);
                    currList.remove(currList.size()-1);
                }
            }
        }
    }

    public static boolean palindrom(String s){
        if(s.length() == 0)
            return true;
        int start = 0;
        int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
