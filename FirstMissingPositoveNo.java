import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/4/2016.
 */
public class FirstMissingPositoveNo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-8,-7,-6));
        System.out.println(findNumber(list));
    }

    public static int findNumber(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            while (list.get(i) != (i+1) || list.get(i) <= 0){
                int targetIndex = list.get(i) - 1;
                int num = list.get(i);
                if (targetIndex < 0 || targetIndex >= list.size() || list.get(targetIndex) == targetIndex+1){
                    break;
                }else{
                    list.set(i, list.get(targetIndex));
                    list.set(targetIndex, num);
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            if(list.get(i) != i+1){
                return i+1;
            }
        }
        return list.size()+1;
    }
}
