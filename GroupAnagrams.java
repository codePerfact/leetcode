import java.util.*;

/**
 * Created by shilpa on 1/11/2017.
 */
public class GroupAnagrams {
    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
       List<List<String>> result =  groupAnagrams(arr);
        System.out.println();
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String >> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted,list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
