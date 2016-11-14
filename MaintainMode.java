import java.util.*;

/**
 * Created by shilpa on 9/10/2016.
 */
public class MaintainMode {
    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,3,1,3,3));
        ArrayList<ArrayList<Integer>> update = new ArrayList<>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(2,2)),new ArrayList<Integer>(Arrays.asList(5,3)),new ArrayList<Integer>(Arrays.asList(3,3)),new ArrayList<Integer>(Arrays.asList(5,3)),new ArrayList<Integer>(Arrays.asList(3,3))));
        getMode(input,update);
    }

    public static ArrayList<Integer> getMode(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> b) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int I : a) {
            if (map.containsKey(I)) {
                map.put(I, map.get(I) + 1);
            } else {
                map.put(I, 1);
            }
        }

        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (ArrayList<Integer> update : b) {
            int index = update.get(0);
            int value = update.get(1);
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
            int toremove = a.get(index - 1);
            a.set(index-1, value);
            if (map.containsKey(toremove) && map.get(toremove) == 1) {
                map.remove(toremove);
                if(maxKey == toremove){
                    maxKey = Integer.MIN_VALUE;
                    maxValue = Integer.MIN_VALUE;
                }
            } else {
                map.put(toremove, map.get(toremove) - 1);
                if(maxKey == toremove){
                    maxValue--;
                }
            }
            if(maxKey == Integer.MIN_VALUE) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > maxValue) {
                        maxKey = entry.getKey();
                        maxValue = entry.getValue();
                    } else if (entry.getValue() == maxValue && entry.getKey() < maxKey) {
                        maxKey = entry.getKey();
                    }
                }
            }else{
                if(map.get(value) > maxValue){
                    maxValue = map.get(value);
                    maxKey = value;
                }else if(map.get(value) == maxValue && value < maxKey){
                    maxKey = value;
                }
            }
            result.add(maxKey);
        }
        return result;
    }
    }

