/**
 * Created by shilpa on 8/26/2016.
 */
public class UniqueChar {
    public static boolean inUniqueChar(String str){
        int checker = 0;
        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((val & (1 << val)) > 0) return false;
            else checker |= (1<<val);
        }
        return true;
    }
}
