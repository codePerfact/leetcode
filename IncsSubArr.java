import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BooleanSupplier;

/**
 * Created by shilpa on 9/10/2016.
 */
public class IncsSubArr {
    public static void main(String[] args){
        cntInc(new ArrayList<>(Arrays.asList(4,5,1,2)));
    }

    public static int cntInc(ArrayList<Integer> a) {
        int count  = a.size();
        if(a.size()<=1){
            return count;
        }
        int tempStart = 0;
        int tempEnd = 0;
        int finalStart = 0;
        int finalEnd = 0;
        while (tempEnd+1 < a.size()){
            if(a.get(tempEnd) < a.get(tempEnd+1)){
                tempEnd++;
            }else if(a.get(tempEnd) >= a.get(tempEnd+1)){
                finalStart = tempStart;
                finalEnd = tempEnd;
                int length = finalEnd-finalStart+1;
                if(length > 1){
                    count += length*(length-1)/2;
                }
                tempStart = tempEnd+1;
                tempEnd = tempEnd+1;
            }
        }
        finalStart = tempStart;
        finalEnd = tempEnd;
        int length = finalEnd-finalStart+1;
        if(length > 1){
            count += length*(length-1)/2;
        }

        return count;
    }
}
