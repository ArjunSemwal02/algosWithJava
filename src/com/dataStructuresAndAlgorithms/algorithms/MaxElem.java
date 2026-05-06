package com.dataStructuresAndAlgorithms.algorithms;

public class MaxElem {
    public static void main(String[] args) {
        int arr[] = {34,-56,456,435,3,4,6,2,-65, 458};

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > largest) largest = arr[i];
        }

        System.out.println(largest);
    }
}
