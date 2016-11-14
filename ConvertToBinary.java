/**
 * Created by shilpa on 9/1/2016.
 */
public class ConvertToBinary {
    public static void main(String[] args){
        String test = "0.5";
        System.out.println(convert(test));
    }

    public static String convert(String s){
        int intPart = Integer.parseInt(s.substring(0, s.indexOf('.')));
        Double decPart = Double.parseDouble(s.substring(s.indexOf('.')));

        String int_string = "";
        while (intPart > 0){
            int r = intPart % 2;
            intPart = intPart/2;
            int_string = r + int_string;
        }

        StringBuffer dec_string = new StringBuffer();
        while (decPart > 0){
            if(dec_string.length() > 32) return "ERROR";
            if(decPart == 1){
                dec_string.append("1");
                break;
            }

            double r = decPart * 2;
            if(r >= 1){
                dec_string.append("1");
                decPart = r -1;
            }else{
                dec_string.append("0");
                decPart = r;
            }
        }
        return int_string+"."+dec_string.toString();
    }
}
