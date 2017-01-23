/**
 * Created by shilpa on 1/8/2017.
 */
public class romanToInt {
    public static void main(String[] args){
        System.out.println(romanToInt("XI"));
    }
    static int value(Character c){
        if(c == 'I')
            return 1;
        else if(c == 'V')
            return 5;
        else if(c == 'X')
            return 10;
        else if(c == 'L')
            return 50;
        else if(c == 'C')
            return 100;
        else if(c == 'D')
            return 500;
        else if( c == 'M')
            return 1000;
        return -1;
    }
    public static int romanToInt(String s) {
        int i=0;
        int s1;
        int s2;
        int res = 0;
        while (i<s.length()){
            s1 = value(s.charAt(i));
            if(i+1 < s.length()) {
                s2 = value(s.charAt(i+1));
                if(s1 < s2) {
                    res += s2-s1;
                    i++;
                    i++;
                }else{
                    res += s1;
                    i++;
                }
            }else {
                res += s1;
                i++;
            }
        }
        return res;
    }
}


