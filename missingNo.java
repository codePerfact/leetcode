/**
 * Created by shilpa on 12/26/2016.
 */
public class missingNo {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(missingNumber(arr));
    }
        public static int missingNumber(int[] nums) {
            for(int i=0; i<nums.length; i++){
                nums[i] = nums[i]+1;
            }
            for(int i=0; i<nums.length; i++){
                int n = Math.abs(nums[i]);
                if(n-1<nums.length) {
                        nums[n-1] = -1 * nums[n-1];
                }
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j] >= 0){
                    return j;
                }
            }
            return nums.length;
        }
    }
