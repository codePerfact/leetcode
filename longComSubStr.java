/**
 * Created by shilpa on 9/25/2016.
 */
public class longComSubStr {
    public static void main(String[] args){
        String[] strArr = {"c","c"};
        System.out.println(longestCommonPrefix(strArr));
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length <= 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }
        for(int i=0; i<strs.length; i++){
            if(strs[i].equals("")){
                return "";
            }
        }
            String commSub = strs[0];
            for(int i=1; i<strs.length; i++){
                int j=0;
                while (j<strs[i].length() && j<commSub.length() && strs[i].charAt(j) == commSub.charAt(j)){
                    j++;
                }
                commSub = commSub.substring(0,j);
            }
            return commSub;
    }
}
