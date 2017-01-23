/**
 * Created by shilpa on 1/10/2017.
 */
public class findInsertIndex {
    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,0));
    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (nums[low] < target && nums[high] > target) {
            return high;
        } else if (low == high && nums[high] < target) {
            return high + 1;
        }else{
            return low;
        }
    }
}
