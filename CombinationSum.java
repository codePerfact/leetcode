import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by shilpa on 1/10/2017.
 */
public class CombinationSum {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args){
        int[] arr = {10,1,2,7,6,1,5};
        combinationSum(arr,8);
        System.out.println();
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        findCombinations(candidates,target,new ArrayList<>(),0);
        return result;
    }
    public static void findCombinations(int[] candidates, int target, ArrayList<Integer> currList, int j){
        if(target == 0)
            result.add(new ArrayList<Integer>(currList));
        else{
            int prev = -1;
            for(int i=j; i<candidates.length; i++){
                if(prev != candidates[i]){
                    if(target-candidates[i] >= 0){
                        currList.add(candidates[i]);
                        findCombinations(candidates, target-candidates[i],currList,i+1);
                        currList.remove(currList.size()-1);
                        prev = candidates[i];
                    }
                }
            }
        }
    }
}

