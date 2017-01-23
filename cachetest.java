/**
 * Created by shilpa on 12/23/2016.
 */
public class cachetest {
    public static void main(String[] args){
        cache c = new cache(2);
        c.set(1,10);
        c.set(5,12);
        System.out.println(c.get(5));
        System.out.println(c.get(1));
        System.out.println(c.get(10));
        c.set(6,14);
        System.out.println(c.get(5));
    }
}
