
package threads.both;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class Test {
    public static void main(String s[]){
        Stack stack = new Stack();
        new RunnableThread(stack,"RunnableThread");
        new ThreadExtend(stack,"ThreadExtend");
    }
}
