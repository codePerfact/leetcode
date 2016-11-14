/**
 * Created by shilpa on 9/19/2016.
 */
public class RemoveElement {
    public static void main(){
        int[] arr = {3,2,2,3};
        removeElement(arr, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        return nums.length-count;
    }
}
