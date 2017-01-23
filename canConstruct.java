import java.util.HashMap;

/**
 * Created by shilpa on 1/2/2017.
 */
public class canConstruct {
    public static void main(String[] args){
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                return false;
            }else{
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
                if(map.get(ransomNote.charAt(i)) == 0){
                    map.remove(ransomNote.charAt(i));
                }
            }
        }
        return true;
    }
}
