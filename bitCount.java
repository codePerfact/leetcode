import java.math.BigInteger;

/**
 * Created by shilpa on 9/17/2016.
 */
public class bitCount {
    public static void main(String[] args) {
        System.out.println(hammingWeight(8));
    }

    public static int hammingWeight(int n) {
       return Integer.bitCount(n);
    }
}