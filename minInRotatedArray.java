/**
 * Created by shilpa on 1/22/2017.
 */
public class minInRotatedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
       return  _findMin(nums,0,nums.length-1);
    }

    public static int _findMin(int[] nums, int low, int high){
       if(low == high)
           return nums[low];
        if(high == low+1)
            return Math.min(nums[low],nums[high]);
        int mid = low + (high-low)/2;
        if(nums[high] > nums[low]){
            return nums[low];
        }else if(nums[low] == nums[high]){
            return _findMin(nums,low+1,high);
        }else if(nums[mid] >= nums[low]){
            return _findMin(nums,mid,high);
        }else{
            return _findMin(nums,low,mid);
        }
    }
}
