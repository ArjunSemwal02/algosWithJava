package com.dataStructuresAndAlgorithms.algorithms;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(3));
    }

    public static int sumOfNaturalNumbers(int n){
        if(n == 1) return 1;

        return n + sumOfNaturalNumbers(n - 1);
    }

}
