import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by shilpa on 8/23/2016.
 */
public class RepeatedAndMissing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int T = in.nextInt();
        while (T-- > 0){
            list.add(in.nextInt());
        }
        System.out.println(repeatedNumber(list));
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> list){
        ArrayList<Integer> duplicate = new ArrayList<>(list);
        int repeated = 0;
        int missing = 0;
        for(int i=0; i<duplicate.size(); i++){
            if(duplicate.get(Math.abs(duplicate.get(i))-1)>0){
                duplicate.set(Math.abs(duplicate.get(i))-1, -duplicate.get(Math.abs(duplicate.get(i))-1));
            }else{
                repeated = Math.abs(duplicate.get(i));
            }
        }

        for(int j=0; j<duplicate.size(); j++){
            if(duplicate.get(j) >0){
                missing = j+1;
            }
        }
        return new ArrayList<>(Arrays.asList(repeated, missing));
    }
}
