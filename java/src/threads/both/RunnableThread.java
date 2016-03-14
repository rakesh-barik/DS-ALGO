package threads.both;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class RunnableThread implements Runnable {
    Stack stack = null;
    String tName = null;

    public RunnableThread(Stack stack, String tName) {
        this.stack = stack;
        this.tName = tName;
        Thread t  = new Thread(this, tName);
        t.start();
    }

    @Override
    public void run() {
        for(int i = 1 ; i < 5;  i++){
            stack.push(i);
            System.out.println("pushed: " + i +" by RunnableThread");
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){}
    }
}
