import java.util.*;

/**
 * Created by shilpa on 1/18/2017.
 */

class WordNode {
    String word;
    int numSteps;
    WordNode pre;

    public WordNode(String word, int noOfSteps, WordNode pre){
        this.word = word;
        this.numSteps = noOfSteps;
        this.pre = pre;
    }
}

public class wordLadder2 {
    public static void main(String[] args){
        HashSet<String> dictV = new HashSet<>();
        dictV.add("hot");
        dictV.add("dot");
        dictV.add("dog");
        dictV.add("lot");
        dictV.add("log");
        List<List<String>> result = findLadders("hit","cog",dictV);
        System.out.println();
    }



    public static List<List<String>> findLadders(String start, String end, Set<String> dictV) {
        List<List<String>> result = new ArrayList<>();
        Queue<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start,1,null));
        dictV.add(end);

        int minStep = Integer.MAX_VALUE;


        HashSet<String> visited = new HashSet<String>();
        HashSet<String> unvisited = new HashSet<String>();
        unvisited.addAll(dictV);

        int preNumSteps = 0;

        while (!queue.isEmpty()){
            WordNode top = queue.remove();
            int currNumSteps = top.numSteps;
            if(top.word.equals(end)){
                if(top.numSteps < minStep){
                    minStep = top.numSteps;
                }
                if(top.numSteps == minStep){
                    ArrayList<String> list = new ArrayList<String>();
                    while (top != null){
                        list.add(0,top.word);
                        top = top.pre;
                    }
                    result.add(list);
                    continue;
                }
            }

            if(preNumSteps < currNumSteps){
                unvisited.removeAll(visited);
            }

            preNumSteps = currNumSteps;

            char[] c = top.word.toCharArray();
            for(int i=0; i<c.length; i++){
                char temp = c[i];
                for(char ch='a'; ch<='z'; ch++){
                    if(c[i] != ch) {
                        c[i] = ch;
                    }
                    if(unvisited.contains(String.valueOf(c))){
                        queue.offer(new WordNode(String.valueOf(c),top.numSteps+1,top));
                        visited.add(String.valueOf(c));
                    }
                }
                c[i] = temp;
            }
        }
        return result;
    }
}
