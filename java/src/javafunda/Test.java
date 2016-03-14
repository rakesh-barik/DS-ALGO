package javafunda;

/**
 * Created by rakesh.barik on 27-02-2016.
 */
/* Implementation to verify following:
1. static method can not be overridden.
2. static methods are always invoked with the reference variable.
3. custom exception class and throwing exception with respect to overiding concept.
 */

public class Test {
    public static void main(String args[]) throws Exception {
        A a = new B();
        a.m2();
        a.m3();
        /*try {
            a.m2();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
