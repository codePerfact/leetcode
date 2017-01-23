import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by shilpa on 1/1/2017.
 */
public class sumZero {
    public static void main(String[] args){
        int[] A = {-1,-1};
        int[] B = {-1, 1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        System.out.println(fourSumCount(A, B, C, D));
    }
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0; i<A.length; i++){
          for(int j=0; j<B.length; j++){
              map.put(A[i]+B[j],map.getOrDefault(A[i]+B[j],0)+1);
          }
      }
      int res = 0;
        for(int i=0; i<C.length; i++){
            for(int j=0; j<D.length; j++){
                res += map.getOrDefault(-1*C[i]*D[j],0);
            }
        }
        return res;
    }

    public static int findSums(ArrayList<int[]> list, int sum) {
        return findcount(list, 0, 0);
    }
    public static int findcount(ArrayList<int[]> list, int start, int currsum){
       if(start >= list.size()){
           if(currsum == 0){
               return 1;
           }else{
               return 0;
           }
       }else{
           int[] current = list.get(start);
           int count = 0;
           for(int i=0; i<current.length; i++){
               count += findcount(list,start+1,currsum+current[i]);
           }
           return count;
       }
    }
}
