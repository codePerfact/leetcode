import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by shilpa on 1/21/2017.
 */
public class FirstRepeatedChar {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        for(char c : map.keySet()){
            if(map.get(c) > 1){
                System.out.println(c);
                break;
            }
        }
    }
}
