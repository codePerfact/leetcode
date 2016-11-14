import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpa on 9/12/2016.
 */
public class Array3Pointers {
    public static void main(String[] args){

    }

    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        int i,j,k;
        int ans = Integer.MAX_VALUE;
        int temp1, temp2, temp3;
        i=j=k=0;
        while (i<a.size() && j<b.size() && k<c.size()){
            temp1 = a.get(i) - b.get(j);
            temp2 = b.get(j) - c.get(k);
            temp3 = c.get(k) - a.get(i);
            ans = min(new ArrayList<>(Arrays.asList(ans, max(new ArrayList<>(Arrays.asList(Math.abs(temp1), Math.abs(temp2), Math.abs(temp3)))))));
            if(Math.abs(temp1) >= Math.abs(temp2) && Math.abs(temp1) >= Math.abs(temp3)){
                if(temp1 > 0){
                    j++;
                }else{
                    i++;
                }
            }else if(Math.abs(temp2) >= Math.abs(temp3) && Math.abs(temp2) >= Math.abs(temp1)){
                if(temp2 > 0){
                    k++;
                }else{
                    j++;
                }
            }else if(Math.abs(temp3) >= Math.abs(temp1) && Math.abs(temp3) >= Math.abs(temp2)){
                if(temp3 > 0){
                    i++;
                }else{
                    k++;
                }
            }
        }
        return ans;
    }

    public int min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int a : list){
            if(a < min){
                min = a;
            }
        }
        return  min;
    }

    public int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int a : list){
            if(a>max){
                max = a;
            }
        }
        return max;
    }
}
