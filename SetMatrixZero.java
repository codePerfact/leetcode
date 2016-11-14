import java.util.ArrayList;

/**
 * Created by shilpa on 8/26/2016.
 */
public class SetMatrixZero {
    public static void main(String[] args){

    }
    public void setZeroes(ArrayList<ArrayList<Integer>> matix){
        int[] row = new int[matix.size()];
        int[] col = new int[matix.get(0).size()];
        for(int i=0; i<matix.size(); i++){
            for(int j=0; j<matix.get(0).size(); j++){
                if(matix.get(i).get(j) == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0; i<matix.size(); i++){
            for (int j=0; j<matix.get(0).size(); j++){
                if(row[i] == 1 || col[j] == 1){
                    matix.get(i).set(j,0);
                }
            }
        }
    }
}
