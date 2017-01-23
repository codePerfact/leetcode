/**
 * Created by shilpa on 1/15/2017.
 */
public class MaxConsicutiveOnes {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = 0;
        int finalCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                tempCount++;
            else{
                if(tempCount > finalCount)
                    finalCount = tempCount;
                tempCount = 0;
            }
        }
        if(tempCount > finalCount)
            finalCount = tempCount;
        return finalCount;
    }
}
