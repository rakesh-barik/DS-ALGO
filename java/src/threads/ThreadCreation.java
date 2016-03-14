package threads;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class ThreadCreation {
    public static void main(String s[]){
        Thread th = Thread.currentThread();
        System.out.println(th);
        System.out.println(th.getName());
        th.setName("Rakesh");
        System.out.println(th.getName());
        th.setPriority(9);
        System.out.println(th);

        for(int i = 1; i <=5 ; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
        throw new ArithmeticException();
    }
}
