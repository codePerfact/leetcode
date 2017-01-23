import java.util.ArrayList;

/**
 * Created by shilpa on 1/6/2017.
 */
public class reverseVowals {
    public static void main(String[] args){
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        while(i<j){
            if(!vowels.contains(arr[i]))
                i++;
            if (!vowels.contains(arr[j]))
                j--;
            if(vowels.contains(arr[i]) && vowels.contains(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        return new String(arr);
    }
}
