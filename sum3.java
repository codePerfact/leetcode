import java.util.*;

/**
 * Created by shilpa on 9/13/2016.
 */
public class sum3 {
    public static void main(String[] args){
        int[] arr = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){

            if(i == 0 || nums[i] > nums[i-1]){
                int j=i+1;
                int k = nums.length-1;
                while (j<k){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                        j++;
                        k--;
                        while (j<k && nums[j] == nums[j-1]){
                            j++;
                        }
                        while (j<k && nums[k] == nums[k+1]){
                            k--;
                        }
                    }else if(nums[i]+nums[j]+nums[k] > 0){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
