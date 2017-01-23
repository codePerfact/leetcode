/**
 * Created by shilpa on 1/11/2017.
 */
public class RainWaterTrapped {
    public int trap(int[] height) {
        int[] maxRight = new int[height.length];
        int maxSoFar = 0;
        for(int i=height.length-1; i>=0; i--){
            if(height[i] > maxSoFar){
                maxSoFar = height[i];
            }
            maxRight[i] = maxSoFar;
        }
        int waterTraped = 0;
        int maxLeft = 0;
        for(int i=0; i<height.length; i++){
            waterTraped += Math.max((Math.min(maxLeft,maxRight[i])-height[i]),0);
            if(height[i] > maxLeft)
                maxLeft = height[i];
        }
        return waterTraped;
    }
}
