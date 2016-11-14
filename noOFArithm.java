/**
 * Created by shilpa on 10/20/2016.
 */
public class noOFArithm {
    public static void main(String[] args){
        numberOfArithmeticSlices(new int[] {1,2,3,8,9,10});
    }
    public static int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        if(A.length < 3){
            return count;
        }
        int[] diff = new int[A.length-1];
        for(int i=1; i<A.length; i++){
            diff[i-1] = A[i] - A[i-1];
        }

        int c = 1;
        int d = diff[0];
        for(int i=1; i<diff.length; i++){
             if(diff[i] == d){
                 c++;
             }else{
                 count += (c)*(c-1)/2;
                 d = diff[i];
                 c = 1;
             }
        }
        count += (c)*(c-1)/2;
        return count;
    }
}
