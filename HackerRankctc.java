/**
 * Created by shilpa on 1/2/2017.
 */
public class HackerRankctc {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(arrayLeftRotation(arr, 5,4));
    }
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        a = reverse(a,0,n-1);
        a = reverse(a,0,n-k-1);
        a = reverse(a,n-k,n-1);
        return a;

    }
    public static int[] reverse(int[] a, int start, int end){
        int i = start;
        int j = end;
        while (i<j){
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return a;
    }
}
