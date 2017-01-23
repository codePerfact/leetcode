import java.util.HashMap;

/**
 * Created by shilpa on 1/2/2017.
 */
public class findDiff {
    public static void main(String[] args){

        System.out.println(findTheDifference("abcd","abcde"));
    }
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) > 1){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                }else{
                    map.remove(s.charAt(i));
                }
            }else{
                return s.charAt(i);
            }
        }
        for(Character key : map.keySet()){
            return key;
        }
        return 1;
    }
}
