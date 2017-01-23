import java.util.HashMap;

/**
 * Created by shilpa on 1/18/2017.
 */
public class LongestConsecutive {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],1);
        }
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i]-1)){
                int tempLength = 1;
                int start = nums[i];
                while (map.containsKey(++start)){
                    tempLength++;
                }
                if(tempLength > maxLength)
                    maxLength = tempLength;
            }
        }
        return maxLength;
    }
}
