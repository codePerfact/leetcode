import java.util.ArrayList;

/**
 * Created by shilpa on 8/23/2016.
 */
public class MinStep {
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y){
        int points = X.size();
        int totalsteps = 0;
        for(int i=0; i<points-1; i++){
            totalsteps += stepsReq(X.get(i), Y.get(i), X.get(i+1), Y.get(i+1));
        }
        return totalsteps;
    }

    public int stepsReq(int x1, int y1, int x2, int y2){
        int xSteps = Math.abs(x2-x1);
        int ySteps = Math.abs(y2-y1);
        return  xSteps >= ySteps ? xSteps : ySteps;
    }
}
