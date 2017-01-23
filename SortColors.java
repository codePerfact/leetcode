/**
 * Created by shilpa on 1/14/2017.
 */
public class SortColors {
    public static void main(String[] args){
        int[] arr = {1,2,0,0,0,0,1,1,2,2,1,2,0};
        sortColors(arr);
        System.out.println();
    }
    public static void sortColors(int[] nums) {
        _sortColors(nums,0,nums.length-1,0);
    }
    public static void _sortColors(int[] nums, int start, int end, int target){
        int i = start;
        int j = start;
        while (i<=end && j<=end){
            while (i <= end && nums[i] == target){
                i++;
            }
            j = i+1;
            while ( j <= end && nums[j] != target){
                j++;
            }
            if(j <= end && i<=end){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        if(target == 0) {
            _sortColors(nums, i, end, 1);
        }
    }
}
