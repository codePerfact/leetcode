/**
 * Created by shilpa on 9/4/2016.
 */
public class CountAndSay {
    public static void main(String[] args){
        System.out.println(countsay(4));
    }
    public static String countsay(int a){
        if(a == 1) return "1";
        if(a == 2) return "2";
        String str = "11";
        for(int i=3; i<=a; i++){
            str += '$';
            String  temp = "";
            int cnt = 1;
            for(int j=1; j<str.length(); j++){
                if(str.charAt(j-1) != str.charAt(j)){
                    temp += cnt;
                    temp += str.charAt(j-1);
                }else{
                    cnt++;
                }
            }
            str = temp;
        }
        return str;
    }
}
