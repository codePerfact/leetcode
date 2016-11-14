/**
 * Created by shilpa on 9/17/2016.
 */
public class SumArr {

    static int sum(int[] numbers) {
    int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
