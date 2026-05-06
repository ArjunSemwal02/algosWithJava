package com.dataStructuresAndAlgorithms.rotateArray;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {6,7,8,9,0,34, 67, 45};
        System.out.println(Arrays.toString(rotateArray(arr, 2)) );
    }

    public static int[] rotateArray(int arr[], int n){

        int arr2[] = new int[arr.length];
        int j = 0;

        for(int i = n; i <= arr.length - 1; i++)
                arr2[j++] = arr[i];

        for(int i = 0; i <= n - 1; i++)
                arr2[j++] = arr[i];

        return arr2;

    }

}
