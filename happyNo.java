/**
 * Created by shilpa on 1/6/2017.
 */
public class happyNo {

    int digitSquareSum(int n){
        int sum = 0;
        int tmp;
        while (n != 0){
            tmp = n%10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }
    public   boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do{
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        }while (slow != fast);
        if(slow == 1) return true;
        else
            return false;
    }
}
