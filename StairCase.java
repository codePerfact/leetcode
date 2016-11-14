/**
 * Created by shilpa on 9/17/2016.
 */
public class StairCase {
    public static void main(String[] args){
        StairCase(6);
    }
    static void StairCase(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
