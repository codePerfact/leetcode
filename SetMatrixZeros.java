import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 8/24/2016.
 */
public class SetMatrixZeros {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(0,0));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(Arrays.asList(list1,list2));
        setZeros(matrix);
        System.out.println(matrix);
    }

    public static void setZeros(ArrayList<ArrayList<Integer>> matix){
        int r = matix.size();
        if(r == 0){
            return;
        }
        int c = matix.get(0).size();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matix.get(i).get(j) == 0){
                    matix.get(i).set(j,-1);
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matix.get(i).get(j) == -1){
                    for(int l=0; l<c; l++){
                        matix.get(i).set(l,0);
                    }

                    for(int k=0; k<r; k++){
                        matix.get(k).set(j,0);
                    }
                }
            }
        }
    }
}
