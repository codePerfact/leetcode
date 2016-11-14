import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 8/23/2016.
 */
public class MaxContSubArr {
     static int maxSubArray(final List<Integer> a) {
        int size = a.size();
        if(size < 1){
            return 0;
        }else{
            int maxSoFar = 0;
            int totalMax = a.get(0);
            for(int i=0; i<size; i++){
                maxSoFar += a.get(i);
                if(maxSoFar > totalMax){
                    totalMax = maxSoFar;
                }
                if(maxSoFar < 0){
                    maxSoFar = 0;
                }
            }
            return totalMax;
        }
    }
}
