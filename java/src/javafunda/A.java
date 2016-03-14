package javafunda;

import java.io.IOException;

/**
 * Created by rakesh.barik on 27-02-2016.
 */
public class A {
    public void m1()throws IOException{
        System.out.println("A-m1");
    }

    public static void m2(){

        System.out.println("A-m2");
    }

    public void m3() throws CustomerNotFoundException {
       throw new CustomerNotFoundException();
    }
}
