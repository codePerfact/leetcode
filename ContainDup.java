import java.util.HashMap;

/**
 * Created by shilpa on 9/23/2016.
 */
public class ContainDup {
    public static void main(String[] args){
        int[] nums = {-1,-1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k < 1){
            return false;
        }
        if(nums.length < 1){
            return false;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int i=0;
        int j=0;
        while (j < nums.length){
            if(j-i <= k){
                if(hashMap.containsKey(nums[j])){
                    return true;
                }else{
                    hashMap.put(nums[j],1);
                }
                j++;
            }else if((j-i) == (k+1)){
                hashMap.remove(nums[i]);
                i++;
                if(hashMap.containsKey(nums[j])){
                    return true;
                }else{
                    hashMap.put(nums[j],1);
                }
                j++;
            }else{
                j++;
            }
        }
        return false;
    }
}
