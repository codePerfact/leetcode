/**
 * Created by shilpa on 1/10/2017.
 */
public class CountSay {
    public static void main(String[] args){
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        String prev = "11";
        if(n == 1)
            return "1";
        else if(n == 2)
            return "11";
        else{
            for(int i=3; i<=n; i++){
                int cnt = 1;
                String str = "";
                int j;
                for(j=1; j<prev.length(); j++){
                    if(prev.charAt(j) == prev.charAt(j-1)){
                        cnt++;
                    }else{
                        str += cnt;
                        str += prev.charAt(j-1);
                        cnt = 1;
                    }
                }
                if(cnt > 0){
                    str += cnt;
                    str += prev.charAt(j-1);
                }
                prev = str;
            }
        }
        return prev;
    }
}
