package threads.multithread;

/**
 * Created by rakesh.barik on 17-03-2016.
 */
public class Test {
    public static void main(String arg[]){
        ProvideNumber provideNumber = new ProvideNumber();
        Thread thread1 = new Thread( new EvenPrinterRunnable(provideNumber,10));
        Thread thread2 = new Thread( new OddPrinterRunnable(provideNumber,10));
        thread1.start();
        thread2.start();
    }
}
