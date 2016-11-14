import java.util.ArrayList;

/**
 * Created by shilpa on 8/24/2016.
 */
public class PascalRows {
    public static void main(String[] args){
        generate(5);
    }

    public  static ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=1; i<=a; i++){
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            if(i > 1){
                ArrayList<Integer> topRow = result.get(i-2);
                for(int j=0; j<topRow.size(); j++){
                    int next = j+1 >= topRow.size() ? 0 : topRow.get(j+1);
                    row.add(topRow.get(j) + next);
                }
            }
            result.add(row);
        }
        return result;
    }
}
