package strings;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class TestStringComparision {
    public static void main(String arg[]){


        Customer cs  = new Customer("rakesh",2);
        Customer cs1 = new Customer("rakesh",2);

        if(cs.getName() == cs1.getName()){
            System.out.println("cs == cs1");
        }
        if(cs.getName().equals(cs1.getName())){
            System.out.println("cs.equals(cs1)");
        }

        if(cs.getRollNo() == cs1.getRollNo()){
            System.out.println("cs.getRollNo() == cs1.getRollNo()");
        }

        String s =  "tavant";
        String s1  =  new String("tavant");
        String s2 =  new String("tavant");
        String s3 = "tavant";

        if(s1 == s2){
            System.out.println("s1 == s2");
        }
        if(s1.equals(s2)){
            System.out.println("s1.equals(s2)");
        }
        if(s == s1){
            System.out.print("== operator");
        }

        if(s == s3){
            System.out.println("s == s3");
        }

        if(s.equals(s1)) {
            System.out.println("equals operator");
        }
    }
}
