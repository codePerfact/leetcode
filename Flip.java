import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by shilpa on 8/23/2016.
 */
public class Flip {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            list.add(Integer.parseInt(input.substring(i, i+1)));
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 0){
                list.set(i, 1);
            }else if(list.get(i) == 1){
                list.set(i, -1);
            }
        }

        int start = 0;
        int end = 0;
        int tempstart = 0;
        int tempend = 0;
        int tempSum = 0;
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            tempSum += list.get(i);
            tempend++;
            if(tempSum < 0){
                tempend = i+1;
                tempstart = i+1;
                tempSum = 0;
            }else if(tempSum > sum){
                start = tempstart;
                end = tempend;
                sum = tempSum;
            }
        }
        if(start+1 >end){
            System.out.println(new ArrayList<Integer>());
        }
        System.out.println(new ArrayList<Integer>(Arrays.asList(start+1,end)));
    }
}
