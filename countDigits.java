/**
 * Created by shilpa on 10/28/2016.
 */
public class countDigits {
    public static void main(String[] args){
        countNumbersWithUniqueDigits(2);
    }

    public static int countNumbersWithUniqueDigits(int n) {
        int[] arr = new int[n];
        int result = 0;
        if(n == 0){
            return 1;
        }
        if(n == 1){
            arr[0] = 10;
        }else if(n == 2){
            arr[0] = 10;
            arr[1] = 81;
        }else if(n > 2){
            arr[0] = 10;
            arr[1] = 81;
            for(int i=2; i<n; i++){
                arr[i] = arr[i-1]*(9-i-1+2);
            }
        }
        for(int i=0; i<n; i++){
            result += arr[i];
        }
        return result;
    }
}
