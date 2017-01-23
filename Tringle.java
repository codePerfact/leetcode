import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/17/2017.
 */
public class Tringle {
    static int minTotal = Integer.MAX_VALUE;

    public static void main(String[] args){
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(6,5,7));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(4,1,8,3));
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        matrix.add(list4);
        System.out.println(minimumTotal(matrix));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        _mininumTotal(triangle, 0, 0, 0);
        return minTotal;
    }
    public static void  _mininumTotal(List<List<Integer>> triangle, int start, int startIndex, int currTotal){
        currTotal += triangle.get(start).get(startIndex);
        if(start+1 >= triangle.size()) {
            if (minTotal > currTotal)
                minTotal = currTotal;
        }else{
            _mininumTotal(triangle,start+1,startIndex,currTotal);
            _mininumTotal(triangle,start+1,startIndex+1,currTotal);
        }
    }
}
