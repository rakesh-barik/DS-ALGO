package javafunda;

/**
 * Created by rakesh.barik on 11-04-2016.
 */
public class Marathon {
    public static void main(String arg[]){
        int[] input2 = {1,2,3,4,5};
        int[] input3 = {-2,2,4,3,1};
        System.out.println(collegecomparison(5,input2,input3));
    }
    public static String collegecomparison(int input1,int[] input2,int[] input3)
    {
        String result = null;        //Write code here
        if((input2.length != input3.length) || input2.length != input1){
           result = "Invalid";
        }else{
            int sum = getSumOfElements(input2);
            int sum2 = getSumOfElements(input3);
            if(sum < 0 || sum2 < 0){
                result = "Invalid";
            }
            else{
                result = (sum == sum2) ? "Equal" : "Unequal";
            }
        }

        return result;
    }

    private static int getSumOfElements(int[] input) {
        int sum = 0;
        for( int i : input) {
            if(i<0){
                sum = i;
                return sum;
            }else{
                sum += i;
            }
        }
        return sum;
    }


}
