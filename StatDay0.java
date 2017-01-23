import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shilpa on 1/9/2017.
 */
public class StatDay0 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] weights = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            weights[i] = scan.nextInt();
        }
        int total = 0;
        for(int i=0; i<n; i++){
            total += arr[i]*weights[i];
        }
        int temp = 0;
        for(int i=0; i<n; i++){
            temp+= weights[i];
        }
        double mean = (double)total/temp;
        BigDecimal bigDecimal = new BigDecimal(mean);
        bigDecimal = bigDecimal.setScale(1,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal.doubleValue());
    }
    public void meanMedianMode(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int total = 0;
        for( int i : arr){
            total += i;
        }

        double mean = (double) total/n;
        Arrays.sort(arr);
        double median = ((double)(arr[n/2]+arr[(n-1)/2]))/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int maxKey = 0;
        int maxCount = 0;
        for(int key : map.keySet()){
            if(map.get(key) > maxCount){
                maxCount = map.get(key);
                maxKey = key;
            }else if(map.get(key) == maxCount && key < maxKey){
                maxKey = key;
            }
        }
        System.out.println(Math.floor(mean*10)/10);
        System.out.println(Math.floor(median*10)/10);
        System.out.println(maxKey);

    }
}
