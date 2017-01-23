/**
 * Created by shilpa on 1/6/2017.
 */
public class validPalindrom {
    public static void main(String[] args){
        System.out.println(isPalindrome(".,"));
    }
    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        if(s.length() > 1){
            while (start<=end){
                while (start<s.length() && !Character.isDigit(arr[start]) && !Character.isLetter(arr[start]))
                    start++;
                while (end>=0 && !Character.isDigit(arr[end]) && !Character.isLetter(arr[end]))
                    end--;
                if(start <= end)
                    if(Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])) {
                        return false;
                    }
                start++;
                end--;
            }
        }
        return true;
    }
}
