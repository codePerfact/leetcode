import java.util.Scanner;

/**
 * Created by shilpa on 1/14/2017.
 */
public class yahooHackerRan {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String line = input.nextLine();
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int end = 0;
            while (end < line.length()){
                while (start<line.length() && line.charAt(start) != '['){
                    start++;
                }
                end = start+1;
                while (end < line.length() && line.charAt(end) != ']')
                    end++;
                if(sb.length() > 0)
                    sb.append(",");
                sb.append(line.substring(start+1,end));
                start = end+1;
                end = end+1;
            }
            System.out.println(sb.toString());
        }
    }
}
