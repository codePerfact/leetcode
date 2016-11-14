import java.util.Arrays;
import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.pow;


/**
 * Created by shilpa on 10/16/2016.
 */
public class CountBits {
    public static void main(String[] args){
        System.out.println(Arrays.toString(countBits(2)));
    }
    static int[] countBits(int num) {
        if(num == 0){
            return new int[] {0};
        }else if(num == 1){
            return new int[] {0, 1};
        }
        int nearest = (int) pow(2, ceil(log(num+1)/log(2)));
        int[] count = new int[nearest];
        count[0] = 0;
        count[1] = 1;
        int j=2;
        int iter = (int)(nearest/4);
        for (int i=1; i<=iter; i=i*2){
            int c = i;
            while (c > 0){
                count[j] = count[j-i];
                j++;
                c--;
            }
            c = i;
            while (c>0){
                count[j] = count[j-i]+1;
                j++;
                c--;
            }
        }
        int[] arr = Arrays.copyOfRange(count,0,num+1);
        return arr;
    }
}
