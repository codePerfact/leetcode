/**
 * Created by shilpa on 1/10/2017.
 */

public class SearchForRange {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int[] result = searchRange(arr,8);
        System.out.println();
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(nums.length <= 0){
            return result;
        }
        int start = leftSearch(nums,0,nums.length-1,target);
        int end = rightSearch(nums,0,nums.length-1,target);
        result[0] = start;
        result[1] = end;
        return result;
    }


    public static int leftSearch(int[] arr, int low, int high, int target){
        while (low < high){
            int mid = (low+high)/2;
            if(arr[mid] == target)
                high = mid;
            else if(arr[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        if(arr[low] == target)
            return low;
        else
            return -1;
    }
    public static int rightSearch(int[] arr, int low, int high, int target){
        while (low < high){
            int mid = (low+high+1)/2;
            if(arr[mid] == target)
                low = mid;
            else if(arr[mid] < target)
                low = mid+1;
            else
                high = mid-1;
        }
        if(arr[high] == target)
            return low;
        else
            return -1;
    }
}

