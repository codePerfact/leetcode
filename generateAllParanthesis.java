import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/9/2017.
 */
public class generateAllParanthesis {
    static List<String> result = new ArrayList<>();
    public static void main(String[] args){
        for(String s :generateParenthesis(1)){
            System.out.println(s);
        }
    }
    public static List<String> generateParenthesis(int n) {
        return generate(n,n,"");
    }
    public static List<String> generate(int leftRemain, int rightRemain, String str){
        if(rightRemain <= 0)
            result.add(str);
        else if(leftRemain > 0){
            generate(leftRemain-1,rightRemain,str+"(");
            if(leftRemain<rightRemain)
                generate(leftRemain,rightRemain-1,str+")");
        }else{
            generate(leftRemain,rightRemain-1,str+")");
        }
        return result;
    }
}
