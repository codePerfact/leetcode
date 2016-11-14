/**
 * Created by shilpa on 9/14/2016.
 */
public class MoveZeros {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(arr);
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        int current = 0;
        while (current < nums.length){
           if(nums[current] == 0){
               count++;
           }else{
               nums[current-count] = nums[current];
           }
           current++;
        }
        int j = nums.length-1;
        while (count > 0){
            nums[j] = 0;
            count--;
            j--;
        }
    }
}
