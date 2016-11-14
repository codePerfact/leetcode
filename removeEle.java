/**
 * Created by shilpa on 9/19/2016.
 */
public class removeEle {
    public static void main(String[] args){
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i+1 < nums.length && nums[i] == nums[i+1]){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        return nums.length-count;
    }
}
