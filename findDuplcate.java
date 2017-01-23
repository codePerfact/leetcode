/**
 * Created by shilpa on 1/6/2017.
 */
public class findDuplcate {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,6};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int no = Math.abs(nums[i]);
            if(nums[no-1] < 0){
                return no;
            }else{
                nums[no-1] = -1*nums[no-1];
            }
        }
        return -1;
    }
}
