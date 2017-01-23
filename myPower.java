/**
 * Created by shilpa on 1/11/2017.
 */
public class myPower {
    public static void main(String[] args){
        System.out.println(myPow(34.00515,-3));
    }
    public static double myPow(double x, int n){
        if(n == 0)
            return 1;
        else if( n < 0) {
            if(n == Integer.MIN_VALUE){
                ++n;
                n = -n;
                x = 1/x;
                return x*x*myPow(x*x,n/2);
            }else {
                n = -n;
                x = 1 / x;
            }
        }
        return n%2 == 0 ? myPow(x*x,n/2):x*myPow(x*x,n/2);
    }

}
