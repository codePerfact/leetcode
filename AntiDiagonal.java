import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * Created by shilpa on 8/24/2016.
 */
public class AntiDiagonal {
    public static void main(String[] args){
        ArrayList<Integer> line1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> line2 = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> line3 = new ArrayList<>(Arrays.asList(7,8,9));
        diagonal(new ArrayList<>(Arrays.asList(line1,line2,line3)));
    }

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int row = a.size();
        int col = a.get(0).size();
        for(int i=0; i<col; i++){
            ArrayList<Integer> line = new ArrayList<>();
            for(int r=0,c=i; r>=0 && r<row && c >=0 && c <col; r++,c--){
                line.add(a.get(r).get(c));
            }
            result.add(line);
        }

        for(int i=1; i<row; i++){
            ArrayList<Integer> line = new ArrayList<>();
            for(int r=i,c = col-1; r>=0 && r<row && c >=0 && c <col; r++,c--){
                line.add(a.get(r).get(c));
            }
            result.add(line);
        }

        return result;
    }
}
