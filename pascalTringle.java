import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/17/2017.
 */
public class pascalTringle {
    public static void main(String[] args){
        List<Integer> result = getRow(3);
        System.out.println();
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex < 0)
            return result;
        result.add(1);
        if(rowIndex == 0)
            return result;
        List<Integer> prev = new ArrayList<>(result);
        result.clear();
        for(int i=1; i<=rowIndex; i++){
            result.add(1);
            for(int j=0; j<prev.size(); j++){
                if(j+1 < prev.size())
                    result.add(prev.get(j)+prev.get(j+1));
                else{
                    result.add(prev.get(j));
                }
            }
            prev = new ArrayList<>(result);
            result.clear();
        }
        return prev;
    }
}
