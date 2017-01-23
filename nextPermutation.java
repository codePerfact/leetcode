import java.util.ArrayList;

/**
 * Created by shilpa on 1/10/2017.
 */
public class nextPermutation {
    public static void main(String[] args){
        int[] arr = {1,1};
        nextPermutation(arr);
    }
    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        int p = 0;
        int q = 0;
        for(p=nums.length-2; p>=0; p--){
            if(nums[p] < nums[p+1])
                break;
        }
        if(p < 0){
            reverse(nums,0,nums.length-1);
            return;
        }else{
            for(q=nums.length-1; q>p; q--){
                if(nums[q] > nums[p])
                    break;
            }
        }
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        reverse(nums,p+1,nums.length-1);
    }
    public static void reverse(int[] a, int start, int end){
        while (start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
