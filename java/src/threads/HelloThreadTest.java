package threads;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class HelloThreadTest {
    public static void main(String s[]){
        new HelloThread("rakesh");
        new HelloThread("barik");
        new HelloThread("dumer");
        new HelloThread("tech");
        for(int i = 1; i < 5; i++){
            System.out.println(" "+ i + " : main");
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){

        }

    }
}
