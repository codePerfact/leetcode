/**
 * Created by shilpa on 1/2/2017.
 */
public class sum {
    public int getSum(int a, int b) {
        while (b != 0){
            int carry  = a & b;
            a = a ^ b;
            b = carry<<1;
        }
        return a;
    }
}
