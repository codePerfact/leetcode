/**
 * Created by shilpa on 10/20/2016.
 */
public class findUnique {
    public int[] singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i=1; i<nums.length; i++){
            xor ^= nums[i];
        }

        int setbit = xor & ~(xor-1);
        int x = 0;
        int y = 0;
        for(int i=0; i<nums.length; i++){
            if((nums[i] & setbit) != 0){
                x = x^nums[i];
            }else{
                y = y^nums[i];
            }
        }
        return new int[] {x,y};
    }
}
