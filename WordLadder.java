import java.util.*;

/**
 * Created by shilpa on 1/17/2017.
 */

class WordNode1 {
    ArrayList<String> wordlist;
    public WordNode1(ArrayList<String> list){
        this.wordlist = list;
    }
}
public class WordLadder {
    static int minLength = Integer.MAX_VALUE;
    static List<List<String>> result = new ArrayList<>();
    public static void main(String[] args){
        String beginWord = "qa";
        String endWord = "sq";
        Set<String> wordList = new HashSet<>(Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"));
        List<List<String>> result = findLadders(beginWord,endWord,wordList);
        System.out.println();
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        if(!wordList.contains(endWord))
            wordList.add(endWord);
        LinkedList<WordNode1> queue = new LinkedList<>();
        queue.add(new WordNode1(new ArrayList<String>(Arrays.asList(beginWord))));
        while (!queue.isEmpty()){
            WordNode1 top = queue.remove();
            if(top.wordlist.get(top.wordlist.size()-1).equals(endWord)){
                if(top.wordlist.size() == minLength){
                    result.add(top.wordlist);
                }else if(top.wordlist.size() < minLength){
                    result.clear();
                    result.add(top.wordlist);
                    minLength = top.wordlist.size();
                }else{
                    return result;
                }
            }
            char[] arr = top.wordlist.get(top.wordlist.size()-1).toCharArray();
            for(int i=0; i<arr.length; i++){
                char ch = arr[i];
                for(char c='a'; c<='z'; c++){
                    arr[i] = c;
                    String newWord = new String(arr);
                    if(wordList.contains(newWord) && !top.wordlist.contains(newWord)){
                        ArrayList<String> newList = new ArrayList<>(top.wordlist);
                        newList.add(newWord);
                        queue.add(new WordNode1(newList));

                    }
                }
                arr[i] = ch;
            }

        }
        return result;
    }
}
