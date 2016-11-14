import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by shilpa on 9/15/2016.
 */
public class Anagram {
    public static void main(String[] args){
        System.out.println(isAnagram("aacc", "ccac"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }else{
                map1.put(s.charAt(i),1);
            }
        }
        for(int j=0; j<t.length(); j++){
            if(map1.containsKey(t.charAt(j))){
                if(map1.get(t.charAt(j)) == 1){
                    map1.remove(t.charAt(j));
                }else{
                    map1.put(t.charAt(j), map1.get(t.charAt(j))-1);
                }
            }else{
                return false;
            }
        }
        if(map1.size() > 0){
            return false;
        }else{
            return true;
        }
    }
}
