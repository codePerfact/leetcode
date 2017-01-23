import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by shilpa on 12/24/2016.
 */
class node{
    Character c;
    int count;
}
public class frequencySort {
    public static void main(String[] args){
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        while (map.size() > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    if (isMax(map, s.charAt(i))) {
                        for (int j = 0; j < map.get(s.charAt(i)); j++) {
                            result.append(s.charAt(i));
                        }
                        map.remove(s.charAt(i));
                    }
                }
            }
        }
        return result.toString();
    }


    public static boolean isMax(HashMap<Character, Integer> map, Character c){
        for(Character key : map.keySet()){
            if(map.get(key) > map.get(c)){
                return false;
            }
        }
        return true;
    }
}
