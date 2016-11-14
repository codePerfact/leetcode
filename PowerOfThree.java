/**
 * Created by shilpa on 9/16/2016.
 */
public class PowerOfThree {
    public static void main(String[] args){

    }

    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        return n == Math.pow(3,Math.round(Math.log(n)/Math.log(3)));
    }
}
