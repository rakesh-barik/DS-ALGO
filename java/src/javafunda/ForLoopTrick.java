package javafunda;

/**
 * Created by rakesh.barik on 15-04-2016.
 */
public class ForLoopTrick {
    public static void main(String arg[]){
        int s,a = 12345;
        for(s=0     ;   a!=0     ;    s=s*10+(a%10)   ,   a=a/10){
            System.out.println(s);
        }
    }
}
