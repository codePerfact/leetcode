/**
 * Created by shilpa on 1/13/2017.
 */
public class validNumber {
    public static void main(String[] args){
        System.out.println(isNumber("32.e-80123"));
    }
    public static boolean isNumber(String s) {
        s = s.trim();

        if(s.length() == 0)
            return false;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            s = s.substring(1);
        }
        if(s.equals("."))
            return false;
        else if(s.equals("e"))
            return false;

        boolean isDecimal = false;
        boolean isExponential = false;
        boolean numberSeen = false;
        boolean plusSeen = false;
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) {
                if(s.charAt(i) == '.'){
                    if(isDecimal){
                        return false;
                    }else if(isExponential){
                        return false;
                    }else{
                        isDecimal = true;
                    }
                }else if(s.charAt(i) == 'e'){
                    if(isExponential){
                        return false;
                    }else if(i == s.length()-1) {
                        return false;
                    }else if(i == 0){
                        return false;
                    }else if(!Character.isDigit(s.charAt(i+1)) && s.charAt(i+1) != '+' && s.charAt(i+1) != '-') {
                        return false;
                    }else if(s.charAt(i-1) == '.' && !numberSeen){
                        return false;
                    }else{
                        isExponential = true;
                    }
                }else if(s.charAt(i) =='+'){
                    if(!isExponential || plusSeen){
                        return false;
                    }else if(i==s.length()-1){
                        return false;
                    }else{
                        plusSeen = true;
                    }
                }else if(s.charAt(i) =='-'){
                    if(!isExponential || plusSeen){
                        return false;
                    }else if(i==s.length()-1){
                        return false;
                    }else{
                        plusSeen = true;
                    }
                }else{
                    return false;
                }
            }else {
                numberSeen = true;
            }
        }
        return true;
    }
}
