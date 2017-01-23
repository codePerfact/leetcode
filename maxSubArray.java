/**
 * Created by shilpa on 1/12/2017.
 */
public class maxSubArray {
    public static void main(String[] args){
        int[] arr = {-2,1};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        int i=0;
        do{
            tempSum += nums[i];
            if(tempSum > maxSum){
                maxSum = tempSum;
            }
            if(tempSum < 0){
                tempSum = 0;
            }
            i++;
        }while (i<nums.length);
        return maxSum;
    }
}
