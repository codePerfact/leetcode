/**
 * Created by shilpa on 1/7/2017.
 */
public class atoi {
    public static void main(String[] args){
        System.out.println(myAtoi("-2147483647"));
    }
    public static int myAtoi(String str) {
        if(str.length() <= 0)
            return 0;
        int i=0;
        while (str.charAt(i) == ' '){
            i++;
        }
        boolean sign = false;
        if(str.charAt(i) == '-'){
            sign = true;
            i++;
        }

        else if(str.charAt(i) == '+'){
            i++;
        }

        int no = 0;
        while (i<str.length() && Character.isDigit(str.charAt(i))){
            if(no == 0)
                no = Character.getNumericValue(str.charAt(i));
            else{
                if(no == Integer.MAX_VALUE/10){
                    if(sign && Character.getNumericValue(str.charAt(i)) >= 8){
                        no = Integer.MIN_VALUE;
                        return no;
                    }else if (!sign && Character.getNumericValue(str.charAt(i)) >= 7){
                        no = Integer.MAX_VALUE;
                        return no;
                    }else{
                        no = no*10 + Character.getNumericValue(str.charAt(i));
                    }
                }else{
                    if(no > Integer.MAX_VALUE/10){
                        if(sign)
                            return Integer.MIN_VALUE;
                        else
                            return Integer.MAX_VALUE;
                    }else{
                        no = no*10 + Character.getNumericValue(str.charAt(i));
                    }
                }
            }
            i++;
        }
        if(sign == true)
            return -1*no;
        else
            return no;
    }
}
