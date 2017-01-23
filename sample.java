/**
 * Created by shilpa on 12/15/2016.
 */
public class sample {
    public static void main(String[] args){
        System.out.println(mergeStrings("abc","def"));
    }
    static String mergeStrings(String a, String b) {
        char[] result = new char[a.length() + b.length()];
        if(a == null || b == null){
            return result.toString();
        }
        int i =0;
        int j = 0;
        int k = 0;
        while (i<a.length() || j<b.length()){
            if(i<a.length()) {
                result[k] = a.charAt(i);
                k++;
                i++;
            }
            if(j < b.length()) {
                result[k] = b.charAt(j);
                k++;
                j++;
            }
        }
    return String.valueOf(result);
    }
}
