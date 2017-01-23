/**
 * Created by shilpa on 1/2/2017.
 */
public class findSum {
    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        int i = 0;
        while (num != 0){
            i += num%10;
            num = num/10;
            if(num == 0 && i/10 > 0){
                num = i;
                i = 0;
            }
        }
        return i;
    }
}
