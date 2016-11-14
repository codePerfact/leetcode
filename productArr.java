/**
 * Created by shilpa on 10/20/2016.
 */
public class productArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        productExceptSelf(arr);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = 1;
        for(int i=1; i<nums.length; i++){
            arr1[i] = nums[i-1]*arr1[i-1];
        }
        int[] arr2 = new int[nums.length];
        arr2[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            arr2[i] = arr2[i+1]*nums[i+1];
        }
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = arr1[i]*arr2[i];
        }
        return result;
    }
}
