import java.io.CharArrayWriter;
import java.util.ArrayList;

/**
 * Created by shilpa on 8/26/2016.
 */
public class RemoveDup {
    public static void RemoveDup(String str){
        if(str == null) return ;
        int len = str.length();
        if(len < 2) return ;
        boolean[] hit = new boolean[256];
        for(int i=0; i<256; i++){
            hit[i] = false;
        }

        char[] arr = str.toCharArray();

        hit[arr[0]] = true;
        int tail = 1;
        for(int i=1; i<len; i++){
            if(!hit[arr[i]]){
                hit[arr[i]] = true;
                arr[tail] = arr[i];
                tail++;
            }
        }
        arr[tail] = 0;
    }
}
