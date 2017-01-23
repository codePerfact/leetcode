import java.util.HashMap;

/**
 * Created by shilpa on 1/2/2017.
 */
public class longestPali {
    public static void main(String[] args){
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int count = 0;
        int flag = 0;
        for(Character key : map.keySet()){
            count += (map.get(key)/2)*2;
            if(map.get(key)%2 != 0){
                flag = 1;
            }
        }
        if(flag == 1){
            count++;
        }
        return count;
    }
}
