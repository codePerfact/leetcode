import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/15/2017.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            result.add(0);
            return result;
        }

        result = grayCode(n - 1);
        int numToAdd = 1 << n - 1;
        for (int i = result.size() - 1; i >= 0; i--) {
            result.add(result.get(i) + numToAdd);
        }
        return result;
    }
}
