package threads.multithread;

/**
 * Created by rakesh.barik on 18-03-2016.
 */
public class EvenPrinterRunnable implements Runnable {

        private ProvideNumber provideNumber;
        private int max;

    public EvenPrinterRunnable(ProvideNumber provideNumber, int max) {
        this.provideNumber = provideNumber;
        this.max = max;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < max ; i++){
            if(i%2 == 0){
               provideNumber.printEven(i);
            }
        }
    }
}
