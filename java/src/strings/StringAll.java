package strings;

/**
 * Created by rakesh.barik on 01-03-2016.
 */
public class StringAll {
    public static void main(String arg[]){
        String s= "abc";
        System.out.println(s);
        System.out.println(s+"def");
        String s1 = s+ "def";
        String s2 = s1;
        String s3 = s1.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String str1 = new String("jkl");
        String str2 = "jkl";
        System.out.println(str1 == str2);
        System.out.println(str1.intern() == str2);

        String str = "tavanttechnologies";
        System.out.println(str.length());
        System.out.println(str);
        str.concat(".com");
        System.out.println(str);
        String st = str.concat(".com");
        System.out.println("st >> "+ st);
        System.out.println(str.charAt(2));
    }
}
