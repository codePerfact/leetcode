/**
 * Created by shilpa on 1/7/2017.
 */
import java.util.HashMap;

public class longestSubnonRe {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return 1;
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int end = 1;
        map.put(s.charAt(start),1);
        int tempLen = 1;
        int finalLen = 0;
        while (end < s.length()){
            while (end < s.length() && !map.containsKey(s.charAt(end))){
                map.put(s.charAt(end),1);
                tempLen++;
                if(finalLen < tempLen){
                    finalLen = tempLen;
                }
                end++;
            }
            if(end < s.length() && map.containsKey(s.charAt(end))){
                while (start <=end && s.charAt(start) != s.charAt(end)) {
                    map.remove(s.charAt(start));
                    start++;
                    tempLen--;
                }
                if(start <= end && s.charAt(start) == s.charAt(end)){
                    map.remove(s.charAt(start));
                    start++;
                    tempLen--;
                }

            }
        }
        if(tempLen > finalLen)
            finalLen = tempLen;
        return finalLen;
    }
}
