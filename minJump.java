import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 1/11/2017.
 */
public class minJump {
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
    }
    public static int jump(int[] nums) {
        int currMax = 0;
        int njumps = 0;
        int i=0;
        while (currMax < nums.length-1){
            int lastMax = currMax;
            for(;i<=lastMax; i++){
                currMax = Math.max(currMax,i+nums[i]);
            }
            njumps++;
            if(lastMax == currMax) return -1;
        }
        return njumps;
    }
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(i>maxIndex || maxIndex>=(nums.length-1)) break;
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }
        return  maxIndex>=nums.length-1? true: false;
    }
}
