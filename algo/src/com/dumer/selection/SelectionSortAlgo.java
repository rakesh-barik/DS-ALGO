package com.dumer.selection;

/**
 * Created by rakesh.barik on 03-03-2016.
 */
public class SelectionSortAlgo {
    public static void main(String s[]){
        int[] elements = {3,14,115,8};
        int[] sortedElements = doSelectionSort(elements);
        for(int i = 0; i < sortedElements.length; i++){
            System.out.println(sortedElements[i]);
        }
    }

    private static int[] doSelectionSort(int[] elements){
        for(int i = 0; i < elements.length-1 ; i++){
           int index = i;
            for(int j = i+1 ; j < elements.length ; j++) {
                if (elements[j] < elements[index]) {
                    index = j;
                }
                int smallerNumber = elements[index];
                elements[index] = elements[i];
                elements[i] = smallerNumber;
            }
        }
        return elements;
    }
}
