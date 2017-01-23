import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/14/2017.
 */
public class Subsets2 {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int l=0; l<=nums.length; l++){
            List<List<Integer>> list = new ArrayList<>();
            _combine(list,nums,0,nums.length-1,l,new ArrayList<>());
            for(List<Integer> u : list){
                result.add(u);
            }
        }
        return result;
    }

    public void _combine(List<List<Integer>> result, int[] nums, int start, int end, int k, ArrayList<Integer> list){
        if(k == 0){
            result.add(new ArrayList<>(list));
        }else{
            for(int i=start;i<=end; i++){
                if(i == start || nums[i] != nums[i-1]) {
                    list.add(nums[i]);
                    _combine(result, nums, i + 1, end, k - 1, new ArrayList<>(list));
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
