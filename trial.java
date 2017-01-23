import java.util.Scanner;

/**
 * Created by shilpa on 1/9/2017.
 */
public class trial {
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");
        int myInt;
        double myDouble;
        String myString;
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        myString = scan.next();
        System.out.println(i+myInt);
        System.out.println(d+myDouble);
        System.out.println(s+myString);
    }


}
