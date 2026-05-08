package com.dataStructuresAndAlgorithms.arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2,4,5,6,7,8}));
    }

    private static int removeDuplicates(int[] arr){

        int j = 1;

        for (int i = 0; i <= arr.length - 1; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j - 1] = arr[i];
            }
        }

        return j;


    }
}
