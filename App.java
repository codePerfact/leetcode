/**
 * Created by shilpa on 12/27/2016.
 */
 class demoT extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("hello" + i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

 public class App{
    public static void main(String[] args){
        demoT runner1 = new demoT();
        runner1.start();
        demoT runner2 = new demoT();
        runner2.start();
    }
}
