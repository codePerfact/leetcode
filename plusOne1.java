import java.util.*;

/**
 * Created by shilpa on 1/13/2017.
 */
public class plusOne1 {
    public static void main(String[] agrs){
        int[] arr = new int[1];
        arr[0] = 9;
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] plusOne(int[] digits) {
        int carry = 0;
        int sum = 1;
        List<Integer> result = new ArrayList<>();

        for(int j=digits.length-1; j>=0; j--){
            sum += carry;
            if(j >=0) {
                sum += digits[j];
            }
            carry = sum/10;
            result.add(sum%10);
            sum = 0;
        }
        if(carry != 0){
            result.add(carry);
        }
        Collections.reverse(result);
        int[] arr = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}
