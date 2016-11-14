/**
 * Created by shilpa on 9/17/2016.
 */
public class calculate {
    public static void main(String[] args){
        int[] arr = {1,2,3};
       calculate(arr);
    }
    static void calculate(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int n = arr[i];
            if(n == 0){
                System.out.println(0);
            }else {
                int cost = 0;
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        cost += j;
                    }
                }
                System.out.println(cost);
            }
        }
    }
}
