import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by shilpa on 1/15/2017.
 */
public class RestoreIPAddress {
    public static void main(String[] args){
        List<String> results = restoreIpAddresses("0000");
        System.out.println();
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        helper(s,"",result,0);
        return result;
    }

    public static void helper(String s, String current, List<String> result, int step){
        if(step == 4){
            if(s.length() == 0) {
                result.add(current.substring(0, current.length() - 1));
            }
        }else{
                for(int k=1; k<=3; k++){
                    if(s.length() < k) continue;
                    int value = Integer.valueOf(s.substring(0,k));
                    if(value > 255 || k != String.valueOf(value).length()) continue;
                    helper(s.substring(k),current+s.substring(0,k) + ".",result,step+1);
                }
            }
        }
    }
