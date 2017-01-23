/**
 * Created by shilpa on 12/28/2016.
 */
public class HackerRankC {

    public static void main(String[] args){
        System.out.println(counting("10001"));
    }
    static int counting(String s) {
        int count = 0;
        if(s == null || s.length() < 2) {
            return count;
        }else {
            int i = 0;
            int j = i + 1;
            while (j < s.length()) {
                if (s.charAt(i) != s.charAt(j)){
                    count++;
                    int tempi = i;
                    int tempj = j;
                    tempi--;
                    tempj++;
                    while (tempi >= 0 && tempj < s.length()) {
                        if (s.charAt(tempi) == s.charAt(i) && s.charAt(tempj) == s.charAt(j)) {
                            count++;
                        }
                        tempi--;
                        tempj++;
                    }
                }
                i++;
                j++;
            }
        }
        return count;
    }


}
