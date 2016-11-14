import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/13/2016.
 */
public class SubSet {

    public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args){
        System.out.println(subsets(new ArrayList<Integer>(Arrays.asList(1,2,3))));
    }

    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        return subSetUtil(a, a.size()-1);
    }

    public static ArrayList<ArrayList<Integer>> subSetUtil(ArrayList<Integer> a, int end){
        ArrayList<ArrayList<Integer>> resultSubsets;
        if(end < 0){
            resultSubsets = new ArrayList<ArrayList<Integer>>();
            resultSubsets.add(new ArrayList<Integer>());
            return resultSubsets;
        }else{
            resultSubsets = subSetUtil(a, end-1);
            int current = a.get(end);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset : resultSubsets){
                ArrayList<Integer> currentSet = new ArrayList<>();
                currentSet.addAll(subset);
                currentSet.add(current);
                moreSubsets.add(currentSet);
            }
            resultSubsets.addAll(moreSubsets);
            return resultSubsets;
        }
    }
}
