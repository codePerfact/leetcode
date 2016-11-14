import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 8/24/2016.
 */
public class FirstMissingPositive {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,0));
        System.out.println(firstMissingPositive(list));
    }

    public static int firstMissingPositive(ArrayList<Integer> a){
        int len = a.size();
        for(int i=0; i<len; i++){
            while (a.get(i) != i+1 || a.get(i) <0){
                int num = a.get(i);
                int targetIndex = num - 1;
                if(targetIndex < 0 || targetIndex >= len || num == a.get(num-1)){
                    break;
                }else {
                    a.set(i,a.get(num-1));
                    a.set(num-1, num);
                }
            }
        }
        for (int i=0; i<len; i++){
            if(a.get(i) != i+1){
                return i+1;
            }
        }
        return len+1;
    }
}
