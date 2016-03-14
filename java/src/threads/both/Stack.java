package threads.both;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class Stack {
    int x;
    boolean flag;
   synchronized public void push(int x){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.x = x;
        //System.out.println("x is pushed");
        flag = true;
        notify();

    }
    synchronized public int pop(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println("x is poped");
        flag =  false;
        notify();
        return x;
    }

}
