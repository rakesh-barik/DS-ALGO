package threads;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class HelloThread extends Thread {
    String tName;

    public HelloThread(String name) {
        super(name);
        System.out.println(name);
        this.tName = name;
        start();
    }
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println(" "+i+ " : " + tName);
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){

        }
    }
}
