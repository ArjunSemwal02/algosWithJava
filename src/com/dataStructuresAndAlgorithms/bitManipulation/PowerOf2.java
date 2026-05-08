package com.dataStructuresAndAlgorithms.bitManipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(8));
    }

    private static boolean checkPowerOf2(int n){

        if(n == 0) return false;
        return (n & (n - 1)) == 0 ;

    }
}
