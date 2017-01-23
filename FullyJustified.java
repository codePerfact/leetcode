import java.util.ArrayList;
import java.util.List;

/**
 * Created by shilpa on 1/13/2017.
 */
public class FullyJustified {
    List<String> result = new ArrayList<>();
    public List<String> fullJustify(String[] words, int maxWidth) {
        _fullJustify(words,0,maxWidth);
        return result;
    }
    public void _fullJustify(String[] words, int start, int maxWidth){
        if(start <= words.length) {
            int totalLength = 0;
            int i = start;
            int spaces = 0;
            int totalWords = 0;
            while (i<words.length && totalLength <= maxWidth){
                totalLength += words[i].length();
                totalWords++;
                i++;
            }
            i--;
            if(totalLength > maxWidth){
                totalLength -= words[i].length();
                i--;
                totalWords--;
            }
            spaces = totalLength-1;
            totalLength += spaces;
            if(totalLength > maxWidth){
                totalLength -= words[i].length();
                i--;
                totalWords--;
            }
            totalLength -= spaces;
            spaces = totalWords-1;
            totalLength += spaces;
            int remainPositions = maxWidth-totalLength;
            StringBuilder sb = new StringBuilder();

        }
    }
}
