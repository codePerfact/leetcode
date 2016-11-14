import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shilpa on 8/24/2016.
 */
public class MaxDistance {
    public static void main(String[] args){
        System.out.println(maximumGap(new ArrayList<>(Arrays.asList(3,5,4,2))));
    }

    public static int maximumGap(final List<Integer> a) {
        ArrayList<Integer> minL = new ArrayList<>();
        minL.add(a.get(0));
        for(int i=1; i<a.size(); i++){
            minL.add(Math.min(a.get(i),minL.get(i-1)));
        }
        ArrayList<Integer> maxR = new ArrayList<>();
        maxR.add(a.get(a.size()-1));
        for(int i=a.size()-2; i>=0; i--){
            maxR.add(Math.max(a.get(i), maxR.get(maxR.size()-1)));
        }
        Collections.reverse(maxR);
        int i = 0;
        int j = 0;
        int maxDiff = -1;
        while (j < a.size() && i < a.size())
        {
            if (minL.get(i) < maxR.get(j))
            {
                maxDiff = Math.max(maxDiff, j-i);
                j = j + 1;
            }
            else
                i = i+1;
        }

        return maxDiff;
    }
}
