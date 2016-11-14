import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 9/4/2016.
 */
public class MatrixSortedSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40)), new ArrayList<Integer>(Arrays.asList(15, 25, 35, 45)), new ArrayList<Integer>(Arrays.asList(27, 29, 37, 48)), new ArrayList<Integer>(Arrays.asList(32, 33, 39, 50))));
        findElement(matrix, 29);
    }

    public static void findElement(ArrayList<ArrayList<Integer>> matrix, int key){
        int r = matrix.size();
        int c = matrix.get(0).size();
        int i = r-1;
        int j = 0;
        while (i >= 0 && i < r && j >=0 && j<c){
            if(matrix.get(i).get(j) == key){
                System.out.println("we found the item : Indexs are " + i + ", " + j);
                return;
            }else if(matrix.get(i).get(j) < key){
                j++;
            }else{
                i--;
            }
        }
    }
}
