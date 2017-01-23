/**
 * Created by shilpa on 1/13/2017.
 */
public class addBinary {
    public static void main(String[] args){
        System.out.println(addBinary("1","111"));
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        char carry = '0';
        while (i >=0 || j >=0){
            if( i >= 0 && j>=0){
                if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                    if(carry == '1'){
                        sb.append('1');
                    }else{
                        sb.append('0');
                    }
                    carry = '1';
                }else if(a.charAt(i) == '0' && b.charAt(j) == '0'){
                    if(carry == '1'){
                        sb.append('1');
                    }else{
                        sb.append('0');
                    }
                    carry = '0';
                }else{
                    if(carry == '1'){
                        sb.append('0');
                        carry = '1';
                    }else{
                        sb.append('1');
                        carry = '0';
                    }
                }
                i--;
                j--;
            }else if(i >=0 ){
                if(a.charAt(i) == '1'){
                    if(carry == '1'){
                        sb.append(0);
                        carry = '1';
                    }else{
                        sb.append('1');
                        carry = '0';
                    }
                }else{
                    if(carry == '1'){
                        sb.append('1');
                        carry = '0';
                    }else{
                        sb.append('0');
                        carry = '0';
                    }
                }
                i--;
            }else{
                if(b.charAt(j) == '1'){
                    if(carry == '1'){
                        sb.append(0);
                        carry = '1';
                    }else{
                        sb.append('1');
                        carry = '0';
                    }
                }else{
                    if(carry == '1'){
                        sb.append('1');
                        carry = '0';
                    }else{
                        sb.append('0');
                        carry = '0';
                    }
                }
                j--;
            }
        }
        if (carry != '0'){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
