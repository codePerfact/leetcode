/**
 * Created by shilpa on 1/11/2017.
 */
public class findFirstPositive {
    public static void main(String[] args){
        int[] arr = {2,2};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        if (nums.length <= 0)
            return 1;
        else {
            for (int i = 0; i < nums.length; i++) {
                while((nums[i]-1) < nums.length && (nums[i]-1) >= 0 && nums[i] != (i+1)) {
                    if(nums[nums[i]-1] == nums[i]){
                        break;
                    }
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        if (nums.length == 1){
            if (nums[0] != 1)
                return 1;
            else {
                return 2;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if((nums[i]-1) != i){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
