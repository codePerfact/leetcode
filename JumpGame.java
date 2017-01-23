import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shilpa on 12/29/2016.
 */
public class JumpGame {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,1,0,4));
        System.out.println(canJump(list));
    }
    public static int canJump(ArrayList<Integer> a) {
        int n = a.size();
        ArrayList<Integer> mem = new ArrayList<>();
        for(int i=0; i<n; i++){
            mem.add(0);
        }
        mem.set(0,1);
        for (int j=0; j<a.size(); j++){
            int step = a.get(j);
            for(int i=1; i<=step; i++){
                if(j+i < n && mem.get(j) == 1 && mem.get(j+i) != 1){
                    mem.set(j+i,1);
                }
            }
        }
        return mem.get(n-1);
    }
}
