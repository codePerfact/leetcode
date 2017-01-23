import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shilpa on 1/12/2017.
 */

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class intervalCompare implements Comparator<Interval>{
    public int compare(Interval i1, Interval i2){
        int cmp = Integer.compare(i1.start,i2.start);
        if(cmp != 0)
            return cmp;
        else{
            return Integer.compare(i1.end,i2.end);
        }
    }
}
public class mergeIntervals {
    public static void main(String[] args){
        Interval i1 = new Interval();
        i1.start = 1;
        i1.end = 4;
        Interval i2 = new Interval();
        i2.start = 0;
        i2.end = 0;
        List<Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        List<Interval> result = merge(list);
        System.out.println();
    }


    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> newList = new ArrayList<>();
        int i=0;
        for(i=0; i<intervals.size(); i++){
            if(intervals.get(i).start < newInterval.start){
                newList.add(intervals.get(i));
            }else{
                break;
            }
        }
        newList.add(newInterval);
        while (i<intervals.size()){
            newList.add(intervals.get(i));
            i++;
        }
        return merge(newList);
    }

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        Interval curr = null;
        Collections.sort(intervals,new intervalCompare());
        for(int i=0; i<intervals.size(); i++){
            if(curr == null){
                curr = intervals.get(i);
            }else if(curr.end < intervals.get(i).start){
                result.add(curr);
                curr = intervals.get(i);
            }else{
                Interval t = new Interval();
                t.start = Math.min(curr.start,intervals.get(i).start);
                t.end = Math.max(curr.end,intervals.get(i).end);
                curr = t;
            }
        }
        if(curr != null)
            result.add(curr);
        return result;
    }
}
