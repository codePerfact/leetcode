/**
 * Created by shilpa on 1/2/2017.
 */
public class ColumnNumber {
    public int titleToNumber(String s) {
        int j = 0;
        int sum = 0;
        for(int i= s.length()-1; i>=0; i--){
            sum += (s.charAt(i)-'A'+1)*Math.pow(26,j);
            j++;
        }
        return sum;
    }
}
