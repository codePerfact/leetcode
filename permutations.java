import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 1/11/2017.
 */
public class permutations {
        static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args){
        int[] arr = {1,1,2,2};
        permute(arr);
        System.out.println();
    }
    public static List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        _permute(list,0,nums.length-1);
        return result;
    }
    public static void  _permute(List<Integer> list, int start, int end){
        if(start > end){
            result.add(new ArrayList<Integer>(list));
        }else{
            for(int i=start; i<=end; i++){
                if(containsDuplicate(list,start,i)) {
                    int temp = list.get(start);
                    list.set(start, list.get(i));
                    list.set(i, temp);
                    _permute(list, start + 1, end);
                    temp = list.get(start);
                    list.set(start, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }
    public static boolean containsDuplicate(List<Integer> list, int start, int end){
        for(int i=start; i<end; i++){
            if(list.get(i) == list.get(end))
                return false;
        }
        return true;
    }
}
