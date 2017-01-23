import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by shilpa on 1/8/2017.
 */
public class NumToStr {
    static List<String> list = new ArrayList<>();
   static HashMap<Character,ArrayList<Character>> map = new HashMap<>();

    public static void main(String[] args){
        letterCombinations("3");
        for (String s : list){
            System.out.println(s);
        }
    }
    public static List<String> letterCombinations(String digits) {
        ArrayList<Character> two = new ArrayList<>();
        two.add('a');
        two.add('b');
        two.add('c');
        map.put('2',two);

        ArrayList<Character> three = new ArrayList<>();
        three.add('d');
        three.add('e');
        three.add('f');
        map.put('3',three);

        ArrayList<Character> four = new ArrayList<>();
        four.add('g');
        four.add('h');
        four.add('i');
        map.put('4',four);

        ArrayList<Character> five = new ArrayList<>();
        five.add('j');
        five.add('k');
        five.add('l');
        map.put('5',five);

        ArrayList<Character> six = new ArrayList<>();
        six.add('m');
        six.add('n');
        six.add('o');
        map.put('6',six);


        ArrayList<Character> seven = new ArrayList<>();
        seven.add('p');
        seven.add('q');
        seven.add('r');
        seven.add('s');
        map.put('7',seven);

        ArrayList<Character> eight = new ArrayList<>();
        eight.add('t');
        eight.add('u');
        eight.add('v');
        map.put('8',eight);

        ArrayList<Character> nine = new ArrayList<>();
        nine.add('w');
        nine.add('x');
        nine.add('y');
        nine.add('z');
        map.put('9',nine);

        combinations(digits,"");
        return list;
    }
    public static void combinations(String digits, String str){
        if(digits.length() <= 0){
            if(str.length() > 0)
                list.add(str);
            return;
        }else{
            for(Character c : map.get(digits.charAt(0))){
                combinations(digits.substring(1),str+c);
            }
        }
    }
}
