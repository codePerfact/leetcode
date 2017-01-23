import java.util.Collections;
import java.util.HashMap;

/**
 * Created by shilpa on 1/2/2017.
 */
public class HackerRankcc3 {
    public static void main(String[] args){
        System.out.println(numberNeeded("cde","abc"));
    }
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<first.length(); i++){
            if(map.containsKey(first.charAt(i))){
                map.put(first.charAt(i), map.get(first.charAt(i))+1);
            }else{
                map.put(first.charAt(i),1);
            }
        }

        int count = 0;
        for(int i=0; i<second.length(); i++){
            if(map.containsKey(second.charAt(i))){
                map.put(second.charAt(i),map.get(second.charAt(i))-1);
                if(map.get(second.charAt(i)) == 0){
                    map.remove(second.charAt(i));
                }
            }else{
                count++;
            }
        }
        for(Character key : map.keySet()){
            count += map.get(key);
        }
        return count;
    }
}
