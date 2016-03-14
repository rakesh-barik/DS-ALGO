package threads.both;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class ThreadExtend extends Thread {
    Stack stack = null;
    String tName = null;

    public ThreadExtend(Stack stack, String tName) {
        super(tName);
        this.stack = stack;
        this.tName = tName;
        start();
    }

    public void run(){
        for(int i = 1 ; i < 5;  i++){
            int x = stack.pop();
            System.out.println("pop: " + x +" by ThreadExtend");
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){}
    }
}
