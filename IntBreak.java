/**
 * Created by shilpa on 12/25/2016.
 */
public class IntBreak {
    public int integerBreak(int n) {
        if(n==0) return 0;
        int[] product = new int[n+1];
        product[1] = 1;
        for(int i=1; i<=n; i++){
            for(int k=1; k<i; k++){
                product[i] = Math.max(product[i],Math.max(k*(i-k), product[k]*(i-k)));
            }
        }
        return product[n];
    }
}
