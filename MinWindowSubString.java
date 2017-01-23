import java.util.HashMap;

/**
 * Created by shilpa on 1/14/2017.
 */
public class MinWindowSubString {
    public static void main(String[] args){
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
    public static String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i)+1));
            }else{
                map.put(t.charAt(i),1);
            }
        }
        int minlength = Integer.MAX_VALUE;
        int minStart = 0;
        int minend = 0;
        HashMap<Character, Integer> tempMap = new HashMap(map);
        while (!tempMap.containsKey(s.charAt(start))){
            start++;
        }
        if(tempMap.get(s.charAt(start)) > 1){
            tempMap.put(s.charAt(start),tempMap.get(s.charAt(start)-1));
        }else{
            tempMap.remove(s.charAt(start));
        }
        end = start+1;
        while (!tempMap.containsKey(s.charAt(end))){
            end++;
        }
        if(tempMap.get(s.charAt(end)) > 1){
            tempMap.put(s.charAt(end),tempMap.get(s.charAt(end)-1));
        }else{
            tempMap.remove(s.charAt(end));
        }

        while (end < s.length()){
            if(tempMap.size() == 0){
                if(minlength > (end-start+1)){
                    minlength = end-start+1;
                    minStart = start;
                    minend = end;
                }
                tempMap.put(s.charAt(start),1);
                start += 1;
                while (start<s.length() && !map.containsKey(s.charAt(start))){
                    start++;
                }
            }else {
                end += 1;
                while (end < s.length() && !tempMap.containsKey(s.charAt(end))){
                    end++;
                }
                if(end < s.length()){
                    if(tempMap.get(s.charAt(end)) > 1){
                        tempMap.put(s.charAt(end),tempMap.get(s.charAt(end)-1));
                    }else{
                        tempMap.remove(s.charAt(end));
                    }
                }

            }
        }
        return s.substring(minStart,minend+1);
    }
}
