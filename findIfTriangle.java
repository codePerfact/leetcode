import java.util.Scanner;

/**
 * Created by shilpa on 1/21/2017.
 */
public class findIfTriangle {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();
            if(isTriangle(a,b,c)){
                if(isIsoscale(a,b,c)){
                    System.out.println("Isosceles");
                }else if(isEquilateral(a,b,c)){
                    System.out.println("Equilateral");
                }else{
                    System.out.println("None of these");
                }
            }else{
                System.out.println("None of these");
            }
        }
    }

    public static boolean isTriangle(long a, long b, long c){
        if(a+b > c && a+c >b && b+c > a)
            return true;
        else
            return false;
    }
    public static boolean isIsoscale(long a, long b, long c){
        if((a == b && a != c)|| (b == c && b != a)|| (a == c && a != b))
            return true;
        else
            return false;
    }
    public static boolean isEquilateral( long a, long b, long c){
        if(a == b && b == c && a == c)
            return true;
        else
            return false;
    }
}
