/**
 * Created by shilpa on 10/25/2016.
 */
public class buysellStocks {
    public static void main(String[] args){
        int[] arr = {1,2};
        maxProfit(arr);
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }

        int i=0;
        int profit = 0;
        int n = prices.length;
        while (i<n-1){
            int localmin = Integer.MAX_VALUE;
            int localmax = Integer.MIN_VALUE;
            while (i < n-1 && prices[i+1] < prices[i])
                i++;
            if(i == n-1)
                break;
            localmin = prices[i];
            i++;
            while (i<n && prices[i-1]<=prices[i])
                i++;
            localmax = prices[i-1];
            profit += (localmax-localmin);

        }
        return profit;
    }
}
