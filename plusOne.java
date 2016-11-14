import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by shilpa on 8/23/2016.
 */
public class plusOne{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int numbers = in.nextInt();
        while (numbers-- != 0){
            list.add(in.nextInt());
        }
        System.out.println(plusOne(list));
    }

    static ArrayList<Integer> plusOne(ArrayList<Integer> list){
        int carry = 1;
        int sum;
        int no;
        for(int i = list.size()-1; i>=0; i-- ){
            sum = list.get(i) + carry;
            no = sum %10;
            carry = sum / 10;
            list.set(i, no);
        }
        if(carry != 0){
            Collections.reverse(list);
            list.add(carry);
            Collections.reverse(list);
        }else {
            while (list.get(0) == 0){
                list.remove(0);
            }
        }
        return list;
    }
}
