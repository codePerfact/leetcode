import java.util.Collections;
import java.util.HashMap;

/**
 * Created by shilpa on 1/6/2017.
 */
public class SubStrin {
    static HashMap<Character,Integer> map = null;
    public static void main(String[] args){
        System.out.println(minWindow("abc","cba"));
    }
    public static String minWindow(String s, String t) {

        if(s.equals(t)){
            return s;
        }else if(s.length() < t.length()){
            return new String();
        }else if(t.length() == 1){
            if(s.indexOf(t.charAt(0)) >= 0){
                return new StringBuilder().append(t.charAt(0)).toString();
            }else{
                return new String();
            }
        }
        map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
            }
        }
        int start = 0;
        int end = 0;
        int finalend = 0;
        int finalstart = 0;
        while (end < s.length() && t.indexOf(s.charAt(end)) < 0){
            end++;
        }
        start = end;
        end++;
        while (end < s.length() && t.indexOf(s.charAt(end)) < 0){
            end++;
        }
        int len = Integer.MAX_VALUE;
        while (end < s.length()){
            if(contains(s.substring(start,end+1),t)){
                if(len > end-start+1){
                    len = end-start+1;
                    finalstart = start;
                    finalend = end;
                }
                start++;
                while (t.indexOf(s.charAt(start)) < 0){
                    start++;
                }
            }else{
                end++;
                while (end<s.length() && t.indexOf(s.charAt(end)) < 0){
                    end++;
                }
            }
        }
        if(len == Integer.MAX_VALUE)
            return new String();
        else
            return s.substring(finalstart,finalend+1);
    }

    public  static boolean contains(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) > 1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                }else{
                    map.remove(s.charAt(i));
                }
            }
        }
        if(map.size()>0){
            return false;
        }else{
            return true;
        }
    }
}
