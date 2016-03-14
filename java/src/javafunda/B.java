package javafunda;

import java.io.IOException;

/**
 * Created by rakesh.barik on 27-02-2016.
 */
public class B extends A {
    public void m1 ()throws IOException{
        System.out.println("B-m1");
    }
    public static void m2(){

        System.out.println("B-m2");
    }

    public void m3(){
        try {
            throw new Exception("121");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
