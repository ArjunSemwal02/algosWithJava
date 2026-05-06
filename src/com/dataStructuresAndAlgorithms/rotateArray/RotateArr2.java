package com.dataStructuresAndAlgorithms.rotateArray;

import java.util.Arrays;

public class RotateArr2 {
    // in place rotation

    public static void main(String[] args) {

        int arr[] = {6,7,8,9,0,34, 67, 45};

        reverseArray(arr, 0, 2 - 1);
        reverseArray(arr, 2, arr.length - 1);

//      System.out.println(Arrays.toString(rotation(arr, 2)) );
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length - 1)));

    }

    public static int[] reverseArray(int[] arr, int l, int r){

        int n = r;
        int temp = 0;
        for(int i = l; i <= (n - 1)/2; i++){
            temp = arr[i];
            arr[i] = arr[r];
            arr[r--] = temp;
        }
        return arr;
    }


}
