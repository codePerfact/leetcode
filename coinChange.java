import java.util.Arrays;

/**
 * Created by shilpa on 1/3/2017.
 */
public class coinChange {
    public static void main(String[] args){
        int[] coins = {1,2,3};
        System.out.println(makeChange(coins, 4));
    }
    public static long makeChange(int[] coins, int money) {
        long[][] mem = new long[money+1][coins.length];
        for(int i=0; i<money+1; i++){
            Arrays.fill(mem[i],0);
        }
        Arrays.fill(mem[0],1);
        for(int i=1; i<=money; i++){
            for(int j=0; j<coins.length; j++){
                if((i - coins[j]) >=0){
                    mem[i][j] += mem[i-coins[j]][j];
                }
                if(j-1 >= 0){
                    mem[i][j] += mem[i][j-1];
                }
            }
        }
        return mem[money][coins.length-1];
    }
}
