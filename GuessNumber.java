/**
 * Created by shilpa on 9/19/2016.
 */
public class GuessNumber {
    public static void main(String[] args){
        System.out.println(guessNumber(4));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = (start + end)/2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) < 0) {
                 end = mid-1;
            } else {
                 start = mid+1;
            }
        }
        return -1;
    }
   public static int guess(int key){
       int i = 4;
       if(i > key){
           return 1;
       }else if(i < key){
           return -1;
       }else {
           return 0;
       }
   }
}
