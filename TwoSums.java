import java.util.HashMap;

/**
 * Created by shilpa on 1/7/2017.
 */
public class TwoSums {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        twoSum(arr,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(map.containsKey(target-n)){
                result[0] = map.get(target-n);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
