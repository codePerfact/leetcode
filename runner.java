import sun.awt.image.SurfaceManager;
import sun.awt.windows.ThemeReader;

import javax.annotation.processing.Processor;
import java.util.Scanner;

/**
 * Created by shilpa on 12/27/2016.
 */

public class runner{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args){
        runner app = new runner();
        app.dowork();
    }

    public void dowork(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10000; i++){
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10000; i++){
                    increment();
                }
            }
        });
        t1.start();;
        t2.start();
        System.out.println("Count is : "+count);
    }
}




