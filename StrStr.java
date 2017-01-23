/**
 * Created by shilpa on 1/9/2017.
 */
public class StrStr {
    public static void main(String[] args){
        System.out.println(strStr("helloworld","hllo"));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
