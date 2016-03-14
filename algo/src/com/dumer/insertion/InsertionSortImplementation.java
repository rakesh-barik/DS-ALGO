package com.dumer.insertion;

/**
 * Created by rakesh.barik on 13-03-2016.
 */
/*
* Question: Consider the searching problem:
* INPUT  : A sequence of n numbers A = <a1,a2,...,an> and a value v.
* OUTPUT : An index i such that v = A[i] or the special value NIL if v does not
*           appear in A.
*
*           Write a program (WAP) for linear search, which scans through the sequence, looking
*           for v.
 * */
public class InsertionSortImplementation {

    public static void main(String arg[]){
        int value = 10;
        int[] A = {2,8,45,33,2,10,58,45};
        System.out.println("Index of value "+ value +" : " + linearSearch(A,value));
    }

    private static int linearSearch(int[] a, int value) {
        for(int i = 0; i< a.length; i++){
            if(value == a[i]){
                return i;
            }
        }
        return -1;
    }
}
