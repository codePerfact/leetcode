/**
 * Created by shilpa on 1/6/2017.
 */
public class minSubArrayLen {
    public static void main(String[] args){
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,arr));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = -1;
        if(nums.length < 1){
            return 0;
        }else{
            int tempSum = 0;
            int tempLen = 0;
            int finalLen = Integer.MAX_VALUE;
            while (end < nums.length){
                if(tempSum >= s){
                    if(tempLen < finalLen){
                        finalLen = tempLen;
                    }

                }
                if(tempSum >= s){
                    tempLen--;
                    tempSum -= nums[start];
                    start++;

                }else {
                    end++;
                    if(end < nums.length){
                        tempLen++;
                        tempSum += nums[end];
                    }else{
                        break;
                    }

                }

            }
            if(finalLen == Integer.MAX_VALUE){
                return 0;
            }else{
                return finalLen;
            }
        }
    }
}
