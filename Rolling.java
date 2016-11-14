/**
 * Created by shilpa on 9/17/2016.
 */
public class Rolling {

    public static void main(String [] args){
        String[] op = {"0 0 L", "2 2 L", "0 2 R"};
        System.out.println(rollingString("abc", op));
    }

    static String rollingString(String s, String[] operations) {
        if(s.length() == 0){
            return s;
        }
        char[] arr = s.toCharArray();
        for(int i=0; i<operations.length; i++){
            String[] input = operations[i].split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            String direction = input[2];
            if(direction.equals("L")){
                for(int j=start; j<=end; j++){
                    arr[j] = arr[j] == 'a' ? 'z' : (char)(arr[j]-1);
                }
            }
            if(direction.equals("R")){
                for(int j=start; j<=end; j++){
                    arr[j] = arr[j] == 'z' ? 'a' : (char)(arr[j]+1);
                }
            }
        }
        return new String(arr);
    }
}
