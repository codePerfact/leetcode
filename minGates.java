import java.util.Arrays;

/**
 * Created by shilpa on 1/21/2017.
 */
public class minGates {
    public static void main(String[] args){
        int[] arr1 = {900,910,920};
        int[] arr2 = {930,915,925};
        System.out.println(findMinGates(arr1,arr2,3));
    }
    static int findMinGates(int[] arrivals, int[] departures, int flights) {
        int i=0;
        int j = 0;
        int gates = 0;
        int finalGates = Integer.MIN_VALUE;
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        while (i<flights || j < flights){
            if(i < flights && j < flights){
                if(arrivals[i] <= departures[j]){
                    gates++;
                    if(gates > finalGates)
                        finalGates = gates;
                    i++;
                }else if(arrivals[i] > departures[j]){
                    gates--;
                    j++;
                }
            }else if(i < flights){
                gates++;
                if(gates > finalGates)
                    finalGates = gates;
                i++;
            }else{
                gates--;
                j++;
            }
        }
        return finalGates;
    }
}
