/**
 * Created by shilpa on 10/28/2016.
 */

import java.util.Random;
public class shuffleArray {
    int nums[];

    public static void main(String[] args){
        shuffleArray h = new shuffleArray(new int[] {1,2,3});
        h.shuffle();
        h.reset();
    }
    public shuffleArray(int nums[]){
        this.nums = nums;
    }
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] temp = nums.clone();
        int t;
        Random random = new Random();
        for(int i = temp.length-1; i>0; i--){
            int j = random.nextInt(i);
            t = temp[j];
            temp[j] = temp[i];
            temp[i] = t;
        }
        return temp;
    }
}


