import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by shilpa on 1/2/2017.
 */
public class cookies {
    public static void main(String[] args){
        int[] arr1 = {10,9,8,7};
        int[] arr2 = {5,6,7,8};
        System.out.println(findContentChildren(arr1,arr2));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int total = 0;
        while (i<g.length && j<s.length){
            if(g[i] <= s[j]){
                total++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return total;
    }
}
