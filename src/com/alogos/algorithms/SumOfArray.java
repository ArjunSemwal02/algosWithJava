package com.alogos.algorithms;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {34,5,634,54,645,78,4,308,12,9};

        int sum = 0;

        for(int i: arr){
            sum += i;
        }

        System.out.println(sum);
    }
}
