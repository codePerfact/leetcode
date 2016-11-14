/**
 * Created by shilpa on 9/17/2016.
 */
public class StockSell {
    public static void main(String[] args){
        int[] arr = {2,1,1,1};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int[] amount = new int[nums.length];
        if(nums.length < 1){
            return 0;
        }else {
            for (int i = 0; i < nums.length; i++) {
                amount[i] = Math.max(i - 1 >= 0 ? amount[i - 1] : 0, (i - 2 >= 0 ? amount[i - 2] : 0) + nums[i]);
            }
            return amount[nums.length - 1];
        }
    }
}
