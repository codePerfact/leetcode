/**
 * Created by shilpa on 1/19/2017.
 */
public class maxContinueSub {
    public static void main(String[] args){
        int[] arr = {0,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        if(nums.length == 0)
            return 0;
        int max_ending_here = nums[0];
        int min_ending_here = nums[0];
        int finalProduct = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > 0){
                max_ending_here = max_ending_here*nums[i];
                min_ending_here =  Math.min(min_ending_here*nums[i],1);
            }
            if(nums[i] == 0){
                max_ending_here = 1;
                min_ending_here = 1;
            }
            if(nums[i] < 0){
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here*nums[i],1);
                min_ending_here = Math.min(temp*nums[i],1);
            }
            if(finalProduct < max_ending_here)
                finalProduct = max_ending_here;
        }
        return finalProduct;
    }
}
