package threads.multithread;

/**
 * Created by rakesh.barik on 17-03-2016.
 */
public class ProvideNumber {
    boolean isEvenPrinted = false;


    synchronized void printOdd(int number) {

        while(!isEvenPrinted){
            try {
                //wait until even is not printed.
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd: "+number);
        isEvenPrinted = false;
        notify();
    }

    synchronized void printEven(int number) {
        while(isEvenPrinted){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even: "+number);
        isEvenPrinted = true;
        notify();
    }
}
