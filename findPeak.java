/**
 * Created by shilpa on 1/22/2017.
 */
public class findPeak {
    public static void main(String[] args){
        int[] arr = {1,6,5,4,3,2,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        return _findPeakElement(nums,0,nums.length-1);
    }
    public static int _findPeakElement(int[] nums, int low, int high){
        if(high == low+1){
            if(nums[high] > nums[low])
                return high;
            else
                return low;
        }
        if(low == high)
            return nums[low];
        int mid = (low+(high-low)/2);
        if(mid == 0 && nums[mid+1]<nums[mid])
            return mid;
        if(mid == nums.length-1 && nums[mid-1]<nums[mid])
            return mid;
        if(mid >0 && mid < nums.length-1 && nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])
            return mid;
        else if(nums[mid+1] > nums[mid])
            return _findPeakElement(nums,mid+1,high);
        else
            return _findPeakElement(nums,low,mid-1);
    }
}
