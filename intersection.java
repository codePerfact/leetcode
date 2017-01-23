import java.util.*;

/**
 * Created by shilpa on 1/2/2017.
 */
public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);;
        int i=0;
        int j =0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int l = 0;
        for(Integer k : set){
            result[l++] = k;
        }
        return result;
    }
}