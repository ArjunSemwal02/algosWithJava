package com.dataStructuresAndAlgorithms.rotateArray;

public class SearchRotdArr {

    public static void main(String[] args) {
//        System.out.println(binarySearch(new int[]{0, 2, 4, 6, 7, 8, 9}, 6));
    }

    private static int searchSortedArray(int arr[], int k){

//        getPivot();
//        binarySearch(arr, k, 0, );



        return k;
    }

    private static int getPivot(int[] arr){
        int pivot = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i + 1]) pivot = arr[i + 1];
        }

        return pivot;
    }

    private static int binarySearch(int arr[], int k, int l, int n){
        int r = n;

        for(int i = l; i < r; i++){
            int mid = (i + r)/2;

            if(k == arr[mid]) return mid;
            else if(k < arr[mid]) r = mid;
            else i = mid;

        }
        return -1;
    }


}
