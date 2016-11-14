import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by shilpa on 9/10/2016.
 */
public class LCS {
    public static void main(String[] args){
        System.out.println(maxLCS("abba"));
    }

    public static ArrayList<Integer> maxLCS(String a) {

        ArrayList<Integer> result = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (Character c : a.toCharArray()){
            sb.append(c);
        }

        String b = sb.toString();
        int j=1;
        int maxResult = Integer.MIN_VALUE;
        int minimalJ = Integer.MAX_VALUE;
        if(a.length() < 1){
            return result;
        }
        else if(a.length() == 1){
            result.add(1);
            result.add(0);
            return result;
        }else {
            while (j + 1 <= a.length()) {
                int count = LCS(a.substring(0, j), new StringBuffer(sb.substring(j, a.length())).reverse().toString());
                if (count > maxResult) {
                    maxResult = count;
                    minimalJ = j;
                }
                j++;
            }
            result.add(minimalJ+1);
            result.add(maxResult);
            return result;
        }
    }

    public static int LCS(String a, String b){
        if(a.length() == 0 || b.length() == 0){
            return 0;
        }

        if(a.charAt(a.length()-1) == b.charAt(b.length()-1)){
            return 1+LCS(a.substring(0,a.length()-1), b.substring(0,b.length()-1));
        }else{
            return Math.max(LCS(a,b.substring(0,b.length()-1)), LCS(a.substring(0,a.length()-1),b));
        }
    }
}
