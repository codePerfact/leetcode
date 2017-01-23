/**
 * Created by shilpa on 1/22/2017.
 */
public class EquilibriumIndec {
    public static void main(String[] args){
        int[] arr = {-1,3,-4,5,1,-6,2,1};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] leftSum = new int[A.length];
        int[] rightSum = new int[A.length];

        leftSum[0] = A[0];
        for(int i=1; i<A.length; i++){
            leftSum[i] = leftSum[i-1] + A[i];
        }

        rightSum[A.length-1] = A[A.length-1];
        for(int i= A.length-2; i>=0; i--){
            rightSum[i] = rightSum[i+1]+A[i];
        }
        for(int i=0; i<A.length; i++){
            int leftS = (i == 0) ? 0 : leftSum[i-1];
            int rightS = (i == A.length-1) ? 0 : rightSum[i+1];
            if(leftS == rightS)
                return i;
        }
        return -1;
    }
}
