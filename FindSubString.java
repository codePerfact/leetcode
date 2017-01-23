import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shilpa on 1/9/2017.
 */
public class FindSubString {
    public static void main(String[] agrs){
        String[] arr = {"foo","bar"};
        List<Integer> result = findSubstring("barfoothefoobarman",arr);
        System.out.println();
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        int totalWords = words.length;
        int wordLenght = words[0].length();
        int charLength = totalWords*wordLenght;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else {
                map.put(words[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<s.length()-charLength+1; i++){
            int start = i;
            int end = i+charLength-1;
            if(isAns(s.substring(start,end+1),new HashMap<>(map),wordLenght)){
                result.add(start);
            }
        }
        return result;
    }

    public static boolean isAns(String str, HashMap<String,Integer> words,int wordLength){
      for(int i=0; i<str.length()-wordLength+1; i=i+wordLength){
          String subStr = str.substring(i,i+wordLength);
          if(words.containsKey(subStr)){
              words.put(subStr,words.get(subStr)-1);
              if(words.get(subStr) == 0)
                  words.remove(subStr);
          }else{
              return false;
          }
      }
      if(words.size() == 0){
          return true;
      }else{
          return false;
      }
    }
}
