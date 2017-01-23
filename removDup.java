/**
 * Created by shilpa on 1/6/2017.
 */
public class removDup {
    public static void main(String[] args){
        int[] arr = {1,1,1};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1 ){
            return nums.length;
        }else{
            int len = nums.length;
            for(int i=0; i<len-2;){
                if(nums[i] == nums[i+2]){
                    for(int j = i+2; j<len-1; j++){
                        nums[j] = nums[j+1];
                    }
                    len--;
                }else{
                    i++;
                }
            }
            return len;
        }
    }
}
