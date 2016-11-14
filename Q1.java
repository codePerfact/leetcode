import java.util.*;

/**
 * Created by shilpa on 9/14/2016.
 */
public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = Integer.parseInt(input.nextLine());
        while (T-- > 0){
            String line = input.nextLine();
           System.out.println(commanString(line));
        }
    }

    public static String commanString(String line){
        TreeMap<Character, Integer> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(line);
        int wordCount = 0;
        HashSet<Character> h1 = null;
        HashSet<Character> h2 = null;
        while (st.hasMoreTokens()){
            wordCount++;
            if(h1 == null){
                h1 = new HashSet<>();
                String word = st.nextToken();
                for(int i=0; i<word.length(); i++){
                    h1.add(word.charAt(i));
                }
                continue;
            }else{
                h2 = new HashSet<>();
                String word = st.nextToken();
                for(int i=0; i<word.length(); i++){
                    h2.add(word.charAt(i));
                }
                h1.retainAll(h2);
            }

        }
        TreeMap<Character, Integer> map1 = new TreeMap<>();
        for(Character c : h1){
            map1.put(c,1);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : map1.keySet()){
            sb.append(c);
        }
        return sb.toString();
    }


}
