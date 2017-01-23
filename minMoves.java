/**
 * Created by shilpa on 1/2/2017.
 */
public class minMoves {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result += Math.abs(nums[i] - min);
        }
        return result;
    }
}
