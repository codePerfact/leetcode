/**
 * Created by shilpa on 1/12/2017.
 */
public class PermutatonSequence {
    public static void main(String[] args){
        System.out.println(getPermutation(3,6));
    }
    public static String getPermutation(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        if(k > 1) {
            for (int i = 1; i < k; i++) {
                nextPermutation(arr);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
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
