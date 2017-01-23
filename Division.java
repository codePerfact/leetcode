import org.omg.CORBA.MARSHAL;

/**
 * Created by shilpa on 1/9/2017.
 */
public class Division {
    public static void main(String[] args){
        System.out.println(divide(-2147483648,1));
    }
    public static int divide(int dividend, int divisor) {
        if(divisor == 0)
            return Integer.MAX_VALUE;
        if(divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        if(divisor == 1)
            return dividend;
        long preDevidend = Math.abs((long) dividend);
        long preDivisor = Math.abs((long) divisor);

        int result = 0;
        long currDivisor = preDevidend;
        int currQBase = 1;
        while (preDevidend>=preDivisor){
            if(preDevidend>=currDivisor){
                preDevidend -= currDivisor;
                result += currQBase;
                currQBase *=2;
                currDivisor *= 2;
            }else{
                currDivisor /= 2;
                currQBase /= 2;
            }
        }
        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            return -1 *result;
        else
            return result;
    }
}
