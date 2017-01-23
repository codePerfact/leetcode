import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/14/2017.
 */
public class Combinations {
    static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args){
        combine(4,2);
        System.out.println();
    }
    public static List<List<Integer>> combine(int n, int k) {
        _combine(1,n, k, new ArrayList<Integer>());
        return result;
    }
    public static void _combine(int start,int end, int k, ArrayList<Integer> list){
        if(k == 0){
            result.add(new ArrayList<>(list));
        }else{
            for(int i=start;i<=end; i++){
                list.add(i);
                _combine(i+1,end,k-1,new ArrayList<>(list));
                list.remove(list.size()-1);
            }
        }
    }
}
