import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * Created by shilpa on 1/8/2017.
 */
public class ClosestSum {
    public static void main(String[] args){
        int[] arr = {1,1,-1,-1,3};
        System.out.println(threeSumClosest(arr,-1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        int maxDiff = Integer.MAX_VALUE;
        int closestSum = -1;
        int tempSum = 0;
        Collections.sort(list);
        for(int i=0; i<list.size()-2;i++){
            tempSum = list.get(i);
            tempSum += findSum(new ArrayList<>(list.subList(i+1, list.size())),target-tempSum);
            if(Math.abs(tempSum-target) < maxDiff){
                maxDiff = Math.abs(tempSum-target);
                closestSum = tempSum;
            }

        }
        return closestSum;
    }

    public static int findSum(ArrayList<Integer> list, int target){
        int i=0;
        int j = list.size()-1;
        int diff = Integer.MAX_VALUE;
        int currentSum = -1;
        while (i<j){
            if(Math.abs(list.get(i)+list.get(j)-target) < diff){
                diff = Math.abs(list.get(i)+list.get(j)-target);
                currentSum = list.get(i)+list.get(j);
                if(diff == 0)
                    return currentSum;
            }
            if(list.get(i)+list.get(j) > target){
                j--;
            }else{
                i++;
            }
        }
        return currentSum;
    }
}
