import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/6/2016.
 */
public class SortedInsertPos {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,5,6));
        System.out.println(searchInsert(list, 7));
    }
        public static int searchInsert(ArrayList<Integer> a, int b) {
            int start = 0;
            int end = a.size()-1;
            while (start<end){
                int mid = (start+end)/2;
                if (a.get(mid) == b){
                    return mid;
                }else if(a.get(mid) < b){
                    start = mid+1;
                }else{
                    end = mid;
                }
            }
            return start == a.size()-1 && a.get(start) < b ? start+1:start;
        }
}
