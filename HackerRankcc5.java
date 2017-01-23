import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shilpa on 1/3/2017.
 */
public class HackerRankcc5 {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    public static void main(String[] args){
        HackerRankcc5 h = new HackerRankcc5("geyx rdyd mo j hpys ar r cgcvo mlzbl oe kgi vaf wdi t iuqx jachs hhky sqljh za u xbv v ghwe pac ep owmhz f ivx o pff dnmyf nbjsi meuhu da tq uprj zn tdnzk wcxpn pzb vcl xa xkpka xfw opw acgfq e ey uda uybt vaf f owmhz tdnzk mo vaf mo meuhu mlzbl r pac ghwe za da uybt rdyd f xkpka nbjsi xfw geyx mo hhky j t o hhky pac meuhu owmhz xa ar e t ghwe ghwe u wdi sqljh o ar cgcvo xbv xa wdi mo hpys nbjsi pff e","za ivx sqljh o rdyd v mlzbl meuhu xkpka mo nbjsi nbjsi ivx da vcl dnmyf vcl ivx rdyd t uprj ghwe ivx kgi e xa pac xbv rdyd vcl u mlzbl uda hpys ar t kgi opw oe mlzbl pff oe r wdi iuqx hpys uda kgi kgi da owmhz xa hpys ey ghwe pac dnmyf meuhu wcxpn xkpka tq u opw jachs rdyd sqljh meuhu ivx f j tq hpys ey geyx xa ghwe f ivx u wcxpn o hhky vcl oe vaf r j zn vaf f pff jachs mo uda uybt vcl ey acgfq jachs vaf");
        System.out.println(h.solve());
    }
    public HackerRankcc5(String magazine, String note) {
        if(magazine == null || note == null){
            return;
        }else{
            String[] list1 = magazine.split(" ");
            String[] list2 = note.split(" ");
            this.magazineMap = new HashMap<>();
            this.noteMap = new HashMap<>();
            for(int i=0; i<list1.length; i++){
                if(this.magazineMap.containsKey(list1[i])){
                    this.magazineMap.put(list1[i], this.magazineMap.get(list1[i])+1);
                }else{
                    this.magazineMap.put(list1[i],1);
                }
            }
            for(int i=0; i<list2.length; i++){
                if(this.noteMap.containsKey(list2[i])){
                    this.noteMap.put(list2[i], this.noteMap.get(list2[i])+1);
                }else{
                    this.noteMap.put(list2[i],1);
                }
            }
        }
    }

    public boolean solve() {
        for(String key : this.noteMap.keySet()){
            if(!this.magazineMap.containsKey(key)){
                return false;
            }else{
                if(this.magazineMap.get(key) < this.noteMap.get(key)){
                    return false;
                }
                this.magazineMap.put(key,this.magazineMap.get(key)-this.noteMap.get(key));
                if(this.magazineMap.get(key) == 0){
                    this.magazineMap.remove(key);
                }
            }
        }
        return true;
    }
}
