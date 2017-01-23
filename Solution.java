/**
 * Created by shilpa on 11/24/2016.
 */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        StairCase(6);
    }


    static void StairCase(int n) {
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=n-i; k>0; k--){
                System.out.print("#");
            }
            System.out.println();
        }

    }
    static int sum(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
