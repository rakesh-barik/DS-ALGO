package locgical;

/**
 * Created by rakesh.barik on 18-03-2016.
 */
/*
* find the second largest number in a given array
* */
public class FindSecondLargest {
    public static void main(String arg[]){
        int[] array1 = {11,23,34,24,54};
        System.out.println("Second largest number : " + getTheSecondLargest(array1));

    }

    private static int getTheSecondLargest(int[] array1) {
        int largestNumber = array1[0];
        int secondLargest = array1[0];

        for(int i = 0 ; i<array1.length ; i++){
            if(array1[i] > largestNumber){
                secondLargest = largestNumber;
                largestNumber = array1[i];
            }else if(array1[i] > secondLargest){
                secondLargest = array1[i];
            }
        }
        return secondLargest;
    }


}
