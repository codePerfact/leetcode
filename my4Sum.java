import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shilpa on 1/8/2017.
 */
public class my4Sum {
    public static void main(String[] args){
        int[] arr = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> list = fourSum(arr,0);
        System.out.println("temp");
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4)
            return result;
        Arrays.sort(nums);
       for(int i=0; i<nums.length-3;i++){
           if(i==0 || nums[i]>nums[i-1]){
               for(int j=i+1; j<nums.length-2;j++){
                   if(j == i+1 || nums[j] > nums[j-1]){
                       int k = j+1;
                       int l = nums.length-1;
                       while (k<l) {
                           if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                               result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
                               k++;
                               l--;
                               while (k < l && nums[k] == nums[k - 1]) {
                                   k++;
                               }
                               while (k < l && nums[l] == nums[l + 1]) {
                                   l--;
                               }
                           } else if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
                               k++;
                           } else {
                               l--;
                           }
                       }
                   }

               }
           }

       }
       return result;
    }
}
