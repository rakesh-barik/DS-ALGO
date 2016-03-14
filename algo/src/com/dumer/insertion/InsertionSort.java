package com.dumer.insertion;

/**
 * Created by rakesh.barik on 26-02-2016.
 */
public class InsertionSort {
    public static void main(String arg[]){
        int [] arr1 = {10,34,2};
        int [] array2 = doInsertionSort(arr1);
        //int [] array2 = myInsertionSort(arr1);
        for (int a : array2) {
            System.out.print(a + "  ");
        }

    }

    private static int[] doInsertionSort(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }

    private static int[] myInsertionSort(int[] A){
        for(int j = 1; j < A.length; j++){
           int key = A[j];
            //Insert A[j] into the sorted sequence A[1..j-1]
           int i = j-1;
            while(i >=0 && A[i] > key){
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = key;
        }
        return A;
    }

}
