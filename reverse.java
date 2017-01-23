/**
 * Created by shilpa on 1/7/2017.
 */
public class reverse {
    public static void main(String[] args){
        System.out.println(reverse(-2147483648));
    }
    public static int reverse(int x) {
        int n = 0;
        boolean sign = x < 0 ? true : false;
        x = Math.abs(x);
        if(x < 0)
            return 0;
        while (x != 0){
            int i = x%10;
            x = x/10;
            if(n == 0)
                n = i;
            else{
                if(n == Integer.MAX_VALUE/10){
                    if(sign && i > 8){
                        return 0;
                    }else if (!sign && i > 7){
                        return 0;
                    }else{
                        n = n*10 + i;
                    }
                }else{
                    if(n > Integer.MAX_VALUE/10){
                        if(sign)
                            return 0;
                        else
                            return 0;
                    }else{
                        n = n*10 + i;
                    }
                }
            }
        }
        if(sign)
            return -1*n;
        else
            return n;
    }
}
