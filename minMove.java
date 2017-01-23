import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 12/25/2016.
 */
public class minMove {
    public static void main(String[] args){
        int[] arr = {1,3,2};
        System.out.println(minMoves(arr));
    }

    public static int minMoves(int[] num){
       Arrays.sort(num);
        int result = 0;
       int med = num[(num.length-1)/2];
        for (int i : num){
            result += Math.abs(i - med);
        }
        return result;
    }
}
