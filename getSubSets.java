import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/4/2016.
 */
public class getSubSets {
    public static void main(String[] args){
        ArrayList<Integer> set = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<ArrayList<Integer>> subsets = findSubsets(set, 0);
        System.out.println(subsets);
    }

    public static ArrayList<ArrayList<Integer>> findSubsets(ArrayList<Integer> set, int index){
       ArrayList<ArrayList<Integer>> allsubsets;
        if(set.size() == index){
            allsubsets = new ArrayList<ArrayList<Integer>>();
            allsubsets.add(new ArrayList<Integer>());
        }else{
            allsubsets = findSubsets(set, index+1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset : allsubsets){
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allsubsets.addAll(moreSubsets);
        }
        return allsubsets;
    }
}
