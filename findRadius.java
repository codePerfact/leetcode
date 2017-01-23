/**
 * Created by shilpa on 1/7/2017.
 */
public class findRadius {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,4};
        System.out.println(findRadius(arr1,arr2));
    }
    public static int findRadius(int[] houses, int[] heaters) {
        int minRadious = Integer.MIN_VALUE;
        int minTemp;
        for(int i = 0; i<houses.length; i++){
            minTemp = Integer.MAX_VALUE;
            for(int j=0; j<heaters.length; j++){
                minTemp = Math.abs(heaters[j] - houses[i]) < minTemp ? Math.abs(heaters[j] - houses[i]):minTemp;
            }
            if(minTemp > minRadious)
                minRadious = minTemp;
        }
        return minRadious;
    }
}
