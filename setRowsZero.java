import java.util.HashMap;

/**
 * Created by shilpa on 1/14/2017.
 */
public class setRowsZero {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer,Integer> rows = new HashMap<>();
        HashMap<Integer,Integer> cols = new HashMap<>();
        if(matrix.length == 0){
            return;
        }
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == 0){
                    rows.put(i,1);
                    cols.put(j,1);
                }
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rows.containsKey(i)){
                    matrix[i][j] = 0;
                }else if(cols.containsKey(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
