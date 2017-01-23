import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/17/2017.
 */
public class minSumPath {
    public static void main(String[] args){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3));
        result.add(list1);
        result.add(list2);
        System.out.println(minimumTotal(result));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for(int i=0; i<triangle.get(triangle.size()-1).size(); i++){
            dp[i] = triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
}
