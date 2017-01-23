import java.util.ArrayList;

/**
 * Created by shilpa on 12/28/2016.
 */
public class hackerRankSecond {
    public static void main(String[] args){
        System.out.println(counting("10001"));
    }
    static int counting(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length();){
            int j=i;
            int count = 0;
            while (j < s.length() && s.charAt(j) == s.charAt(i)){
                count++;
                j++;
            }
            i = j;
            list.add(count);
        }
        int total = 0;
        if(list.size() >= 2 ) {
            for (int i = 0; i < list.size() - 1; i++) {
                total += Math.min(list.get(i), list.get(i + 1));
            }
        }
        return total;
    }
}
