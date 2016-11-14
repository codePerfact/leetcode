/**
 * Created by shilpa on 10/20/2016.
 */
public class twoSum {
    public static void main(String[] args){
        int[] arr = {2,3,4};
        twoSum(arr,6);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int sum = 0;
        int[] result = new int[2];
        int j = numbers.length-1;
        while (i<j){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }else if(sum < target){
                i++;
            }else {
                j--;
            }
    }
    return result;
}
}
