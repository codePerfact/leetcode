/**
 * Created by shilpa on 1/7/2017.
 */
public class PalindromNo {
    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        StringBuilder sb1 = new StringBuilder();
        while (x != 0){
            int n = x%10;
            x = x/10;
            sb1.append(n);
        }
        String one = sb1.toString();
        String two = reverse(one);
        if(one.equals(two))
            return true;
        else
            return false;
    }

    public static String  reverse(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j = str.length()-1;
        while (i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
