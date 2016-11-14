import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by shilpa on 9/14/2016.
 */
public class Q8 {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int Q = in.nextInt();
        ArrayList<String> dic = new ArrayList<>();
        for(int i=0; i<L; i++){
            dic.add(in.next());
        }
        for(int j=0; j<Q; j++){
            System.out.println(ladderLength(in.next(), in.next(), dic)-1);
        }

    }

    public static int ladderLength(String start, String end, ArrayList<String> dictV) {
        Queue<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start,1));
        while (!queue.isEmpty()){
            WordNode top = queue.poll();
            dictV.remove(top.word);
            if(top.word.equals(end)){
                return top.numSteps;
            }
            char[] c = top.word.toCharArray();
            for(int i=0; i<c.length; i++){
                char temp = c[i];
                for(char ch='a'; ch<='z'; ch++){
                    c[i] = ch;
                    if(dictV.contains(String.valueOf(c)) || end.equals(String.valueOf(c))){
                        queue.offer(new WordNode(String.valueOf(c),top.numSteps+1));
                    }
                }
                c[i] = temp;
            }
        }
        return 0;
    }


}
