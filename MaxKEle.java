import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shilpa on 10/25/2016.
 */
public class MaxKEle {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        for(int j : map.values()){
            if(j>max){
                max = j;
            }
        }

        ArrayList<Integer>[] list = (ArrayList<Integer>[]) new ArrayList[max+1];
        for(int i = 1; i<=max; i++){
            list[i] = new ArrayList<>();
        }
        for(int key : map.keySet()){
            list[map.get(key)].add(key);
        }

        for(int i = max; i>=1; i--){
            if(list[i].size() > 0){
                for(int a : list[i]){
                    result.add(a);
                }
            }
            if(result.size() == k)
                break;
        }

       return result;
    }
}
