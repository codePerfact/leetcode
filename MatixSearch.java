import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/6/2016.
 */
public class MatixSearch {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(29));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(36));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(63));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(67));
        ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(72));
        ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(74));
        ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(78));
        ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(85));

        System.out.println(searchMatrix(new ArrayList<ArrayList<Integer>>(Arrays.asList(list1)),1));
    }

    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int r = a.size();
        int c = a.get(0).size();
       int i = r-1;
        int j = 0;
        while (i >= 0 && i < r && j >=0 && j<c){
            if(a.get(i).get(j) == b){
                return 1;
            }else if(a.get(i).get(j) < b){
                j++;
            }else{
                i--;
            }
        }
        return 0;
    }
}
